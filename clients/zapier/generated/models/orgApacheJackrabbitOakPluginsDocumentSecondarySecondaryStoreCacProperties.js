const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}includedPaths`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enableAsyncObserver`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}observerQueueSize`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'includedPaths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}includedPaths`)),
            'enableAsyncObserver': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enableAsyncObserver`)),
            'observerQueueSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}observerQueueSize`)),
        }
    },
}
