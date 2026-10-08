const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}maxConnections`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxRequests`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}requestTimeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}requestRetries`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}launchTimeout`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'maxConnections': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxConnections`)),
            'maxRequests': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxRequests`)),
            'requestTimeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}requestTimeout`)),
            'requestRetries': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}requestRetries`)),
            'launchTimeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}launchTimeout`)),
        }
    },
}
