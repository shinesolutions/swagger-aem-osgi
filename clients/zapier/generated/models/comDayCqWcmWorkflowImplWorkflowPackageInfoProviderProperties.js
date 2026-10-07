const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}workflowpackageinfoprovider.filter`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}workflowpackageinfoprovider.filter.rootpath`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'workflowpackageinfoprovider.filter': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}workflowpackageinfoprovider.filter`)),
            'workflowpackageinfoprovider.filter.rootpath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}workflowpackageinfoprovider.filter.rootpath`)),
        }
    },
}
