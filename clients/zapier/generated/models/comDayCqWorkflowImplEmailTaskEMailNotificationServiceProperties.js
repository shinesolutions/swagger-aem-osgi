const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}notify.onupdate`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}notify.oncomplete`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'notify.onupdate': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}notify.onupdate`)),
            'notify.oncomplete': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}notify.oncomplete`)),
        }
    },
}
