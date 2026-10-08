const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}adapter.condition`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}granite.userproperties.nodetypes`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}granite.userproperties.resourcetypes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'adapter.condition': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}adapter.condition`)),
            'granite.userproperties.nodetypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}granite.userproperties.nodetypes`)),
            'granite.userproperties.resourcetypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}granite.userproperties.resourcetypes`)),
        }
    },
}
