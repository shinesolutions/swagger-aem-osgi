const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}hc.name`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}hc.tags`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}hc.mbean.name`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}filter.tags`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}filter.combineTagsWithOr`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'hc.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}hc.name`)),
            'hc.tags': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}hc.tags`)),
            'hc.mbean.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}hc.mbean.name`)),
            'filter.tags': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}filter.tags`)),
            'filter.combineTagsWithOr': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}filter.combineTagsWithOr`)),
        }
    },
}
