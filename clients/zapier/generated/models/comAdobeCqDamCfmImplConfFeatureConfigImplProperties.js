const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}dam.cfm.resourceTypes`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}dam.cfm.referenceProperties`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'dam.cfm.resourceTypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}dam.cfm.resourceTypes`)),
            'dam.cfm.referenceProperties': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}dam.cfm.referenceProperties`)),
        }
    },
}
