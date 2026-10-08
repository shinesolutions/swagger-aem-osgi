const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}maxConnections`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}maxRequests`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}requestTimeout`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}logDir`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'maxConnections': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}maxConnections`)),
            'maxRequests': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}maxRequests`)),
            'requestTimeout': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}requestTimeout`)),
            'logDir': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}logDir`)),
        }
    },
}
