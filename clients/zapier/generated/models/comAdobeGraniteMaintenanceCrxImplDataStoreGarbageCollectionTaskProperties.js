const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}granite.maintenance.mandatory`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}job.topics`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'granite.maintenance.mandatory': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}granite.maintenance.mandatory`)),
            'job.topics': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}job.topics`)),
        }
    },
}
