const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}cq.store.listener.additionalStorePaths`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.store.listener.additionalStorePaths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.store.listener.additionalStorePaths`)),
        }
    },
}
