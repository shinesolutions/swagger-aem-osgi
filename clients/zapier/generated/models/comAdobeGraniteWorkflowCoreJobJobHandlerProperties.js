const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}job.topics`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}allow.self.process.termination`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'job.topics': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}job.topics`)),
            'allow.self.process.termination': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}allow.self.process.termination`)),
        }
    },
}
