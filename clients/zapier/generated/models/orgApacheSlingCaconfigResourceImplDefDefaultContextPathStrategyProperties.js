const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}enabled`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}configRefResourceNames`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}configRefPropertyNames`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}service.ranking`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enabled`)),
            'configRefResourceNames': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}configRefResourceNames`)),
            'configRefPropertyNames': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}configRefPropertyNames`)),
            'service.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}service.ranking`)),
        }
    },
}
