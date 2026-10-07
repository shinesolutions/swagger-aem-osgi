const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}enable`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}agent.configuration`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}context.path`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}disabled.cipher.suites`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}enabled.cipher.suites`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'enable': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enable`)),
            'agent.configuration': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}agent.configuration`)),
            'context.path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}context.path`)),
            'disabled.cipher.suites': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}disabled.cipher.suites`)),
            'enabled.cipher.suites': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}enabled.cipher.suites`)),
        }
    },
}
