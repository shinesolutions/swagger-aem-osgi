const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}serviceName`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}userId`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}accessTokenProvider.target`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}name`)),
            'serviceName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}serviceName`)),
            'userId': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}userId`)),
            'accessTokenProvider.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}accessTokenProvider.target`)),
        }
    },
}
