const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}cq.dam.sync.workflow.id`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.dam.sync.folder.types`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.dam.sync.workflow.id': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.dam.sync.workflow.id`)),
            'cq.dam.sync.folder.types': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.dam.sync.folder.types`)),
        }
    },
}
