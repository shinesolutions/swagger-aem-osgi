const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}poolName`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}allowedPoolNames`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}scheduler.useleaderforsingle`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}metrics.filters`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}slowThresholdMillis`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'poolName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}poolName`)),
            'allowedPoolNames': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}allowedPoolNames`)),
            'scheduler.useleaderforsingle': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}scheduler.useleaderforsingle`)),
            'metrics.filters': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}metrics.filters`)),
            'slowThresholdMillis': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}slowThresholdMillis`)),
        }
    },
}
