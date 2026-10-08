const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}name`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}minPoolSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxPoolSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}queueSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxThreadAge`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}keepAliveTime`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}blockPolicy`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}shutdownGraceful`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}daemon`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}shutdownWaitTime`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}priority`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}name`)),
            'minPoolSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}minPoolSize`)),
            'maxPoolSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxPoolSize`)),
            'queueSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}queueSize`)),
            'maxThreadAge': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxThreadAge`)),
            'keepAliveTime': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}keepAliveTime`)),
            'blockPolicy': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}blockPolicy`)),
            'shutdownGraceful': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}shutdownGraceful`)),
            'daemon': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}daemon`)),
            'shutdownWaitTime': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}shutdownWaitTime`)),
            'priority': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}priority`)),
        }
    },
}
