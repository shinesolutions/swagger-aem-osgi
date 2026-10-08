const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}asyncConfigs`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}leaseTimeOutMinutes`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}failingIndexTimeoutSeconds`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}errorWarnIntervalSeconds`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'asyncConfigs': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}asyncConfigs`)),
            'leaseTimeOutMinutes': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}leaseTimeOutMinutes`)),
            'failingIndexTimeoutSeconds': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}failingIndexTimeoutSeconds`)),
            'errorWarnIntervalSeconds': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}errorWarnIntervalSeconds`)),
        }
    },
}
