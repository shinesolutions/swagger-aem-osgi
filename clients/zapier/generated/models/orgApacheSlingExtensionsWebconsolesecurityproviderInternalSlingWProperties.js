const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}users`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}groups`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'users': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}users`)),
            'groups': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}groups`)),
        }
    },
}
