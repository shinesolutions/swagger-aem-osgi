const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}enabled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}configPath`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}fallbackPaths`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}configCollectionInheritancePropertyNames`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enabled`)),
            'configPath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}configPath`)),
            'fallbackPaths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}fallbackPaths`)),
            'configCollectionInheritancePropertyNames': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}configCollectionInheritancePropertyNames`)),
        }
    },
}
