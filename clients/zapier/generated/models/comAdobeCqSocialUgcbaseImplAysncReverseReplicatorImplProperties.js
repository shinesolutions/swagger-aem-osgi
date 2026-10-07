const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}poolSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxPoolSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}queueSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}keepAliveTime`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'poolSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}poolSize`)),
            'maxPoolSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxPoolSize`)),
            'queueSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}queueSize`)),
            'keepAliveTime': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}keepAliveTime`)),
        }
    },
}
