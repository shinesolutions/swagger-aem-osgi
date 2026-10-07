const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}tenant.root`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}tenant.path.matcher`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'tenant.root': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}tenant.root`)),
            'tenant.path.matcher': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}tenant.path.matcher`)),
        }
    },
}
