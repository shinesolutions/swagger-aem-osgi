const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}adapter.condition`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}taskmanager.admingroups`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'adapter.condition': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}adapter.condition`)),
            'taskmanager.admingroups': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}taskmanager.admingroups`)),
        }
    },
}
