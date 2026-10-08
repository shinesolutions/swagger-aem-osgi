const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}hc.tags`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}exclude.search.path`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'hc.tags': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}hc.tags`)),
            'exclude.search.path': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}exclude.search.path`)),
        }
    },
}
