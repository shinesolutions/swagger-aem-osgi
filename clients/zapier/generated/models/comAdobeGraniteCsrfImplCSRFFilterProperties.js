const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}filter.methods`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}filter.enable.safe.user.agents`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}filter.safe.user.agents`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}filter.excluded.paths`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'filter.methods': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}filter.methods`)),
            'filter.enable.safe.user.agents': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}filter.enable.safe.user.agents`)),
            'filter.safe.user.agents': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}filter.safe.user.agents`)),
            'filter.excluded.paths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}filter.excluded.paths`)),
        }
    },
}
