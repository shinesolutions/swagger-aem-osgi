const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}cq.workflow.config.workflow.packages.root.path`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.workflow.config.workflow.process.legacy.mode`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.workflow.config.allow.locking`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.workflow.config.workflow.packages.root.path': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.workflow.config.workflow.packages.root.path`)),
            'cq.workflow.config.workflow.process.legacy.mode': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.workflow.config.workflow.process.legacy.mode`)),
            'cq.workflow.config.allow.locking': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.workflow.config.allow.locking`)),
        }
    },
}
