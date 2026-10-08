const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}threadPoolSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}delayTime`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}workerSleepTime`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'threadPoolSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}threadPoolSize`)),
            'delayTime': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}delayTime`)),
            'workerSleepTime': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}workerSleepTime`)),
        }
    },
}
