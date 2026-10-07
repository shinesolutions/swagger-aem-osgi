const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}id`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enabled`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}reference`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}interval`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}expression`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}source`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}target`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}login`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}password`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}id`)),
            'enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enabled`)),
            'reference': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}reference`)),
            'interval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}interval`)),
            'expression': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}expression`)),
            'source': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}source`)),
            'target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}target`)),
            'login': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}login`)),
            'password': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}password`)),
        }
    },
}
