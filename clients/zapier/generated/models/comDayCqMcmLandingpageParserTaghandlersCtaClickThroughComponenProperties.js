const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}service.ranking`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}tagpattern`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}component.resourceType`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'service.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}service.ranking`)),
            'tagpattern': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}tagpattern`)),
            'component.resourceType': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}component.resourceType`)),
        }
    },
}
