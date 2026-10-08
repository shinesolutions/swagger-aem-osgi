const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}redirect.enabled`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}redirect.stats.enabled`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}redirect.extensions`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}redirect.paths`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'redirect.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}redirect.enabled`)),
            'redirect.stats.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}redirect.stats.enabled`)),
            'redirect.extensions': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}redirect.extensions`)),
            'redirect.paths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}redirect.paths`)),
        }
    },
}
