const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}facebook`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}twitter`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}provider.config.user.folder`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'facebook': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}facebook`)),
            'twitter': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}twitter`)),
            'provider.config.user.folder': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}provider.config.user.folder`)),
        }
    },
}
