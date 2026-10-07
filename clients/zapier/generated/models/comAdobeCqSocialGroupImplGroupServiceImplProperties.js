const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}maxWaitTime`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}minWaitBetweenRetries`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'maxWaitTime': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxWaitTime`)),
            'minWaitBetweenRetries': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}minWaitBetweenRetries`)),
        }
    },
}
