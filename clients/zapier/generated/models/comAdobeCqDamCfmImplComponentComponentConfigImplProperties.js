const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}dam.cfm.component.resourceType`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}dam.cfm.component.fileReferenceProp`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}dam.cfm.component.elementsProp`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}dam.cfm.component.variationProp`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'dam.cfm.component.resourceType': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}dam.cfm.component.resourceType`)),
            'dam.cfm.component.fileReferenceProp': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}dam.cfm.component.fileReferenceProp`)),
            'dam.cfm.component.elementsProp': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}dam.cfm.component.elementsProp`)),
            'dam.cfm.component.variationProp': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}dam.cfm.component.variationProp`)),
        }
    },
}
