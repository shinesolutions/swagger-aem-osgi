const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}aggregate.relationships`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}aggregate.descend.virtual`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'aggregate.relationships': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}aggregate.relationships`)),
            'aggregate.descend.virtual': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}aggregate.descend.virtual`)),
        }
    },
}
