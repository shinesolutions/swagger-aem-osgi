const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}description`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}overrides`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enabled`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}service.ranking`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'description': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}description`)),
            'overrides': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}overrides`)),
            'enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enabled`)),
            'service.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}service.ranking`)),
        }
    },
}
