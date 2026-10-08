const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}provider.roots`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}kind`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'provider.roots': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}provider.roots`)),
            'kind': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}kind`)),
        }
    },
}
