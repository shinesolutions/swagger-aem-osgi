const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}parameter.whitelist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}parameter.whitelist.prefixes`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}binary.parameter.whitelist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}modifier.whitelist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}operation.whitelist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}operation.whitelist.prefixes`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}typehint.whitelist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}resourcetype.whitelist`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'parameter.whitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}parameter.whitelist`)),
            'parameter.whitelist.prefixes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}parameter.whitelist.prefixes`)),
            'binary.parameter.whitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}binary.parameter.whitelist`)),
            'modifier.whitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}modifier.whitelist`)),
            'operation.whitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}operation.whitelist`)),
            'operation.whitelist.prefixes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}operation.whitelist.prefixes`)),
            'typehint.whitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}typehint.whitelist`)),
            'resourcetype.whitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}resourcetype.whitelist`)),
        }
    },
}
