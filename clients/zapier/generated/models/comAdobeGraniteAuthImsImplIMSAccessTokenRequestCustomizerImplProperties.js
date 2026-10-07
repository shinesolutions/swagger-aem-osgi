const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}auth.ims.client.secret`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}customizer.type`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'auth.ims.client.secret': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auth.ims.client.secret`)),
            'customizer.type': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}customizer.type`)),
        }
    },
}
