const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}hc.name`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}hc.tags`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}hc.mbean.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}mbean.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}attribute.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}attribute.value.constraint`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'hc.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}hc.name`)),
            'hc.tags': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}hc.tags`)),
            'hc.mbean.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}hc.mbean.name`)),
            'mbean.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}mbean.name`)),
            'attribute.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}attribute.name`)),
            'attribute.value.constraint': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}attribute.value.constraint`)),
        }
    },
}
