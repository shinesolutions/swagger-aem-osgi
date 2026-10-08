const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}More Info`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'More Info': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}More Info`)),
            '/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}`)),
        }
    },
}
