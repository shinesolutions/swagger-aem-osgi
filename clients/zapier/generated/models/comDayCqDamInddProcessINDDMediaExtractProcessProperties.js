const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}process.label`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.dam.indd.pages.regex`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}ids.job.decoupled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}ids.job.workflow.model`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'process.label': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}process.label`)),
            'cq.dam.indd.pages.regex': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.dam.indd.pages.regex`)),
            'ids.job.decoupled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}ids.job.decoupled`)),
            'ids.job.workflow.model': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}ids.job.workflow.model`)),
        }
    },
}
