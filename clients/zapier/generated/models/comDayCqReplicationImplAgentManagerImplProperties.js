const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}job.topics`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}serviceUser.target`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}agentProvider.target`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'job.topics': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}job.topics`)),
            'serviceUser.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}serviceUser.target`)),
            'agentProvider.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}agentProvider.target`)),
        }
    },
}
