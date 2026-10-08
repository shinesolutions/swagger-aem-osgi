const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}event.topics`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}event.filter`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}verbs`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event.topics': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}event.topics`)),
            'event.filter': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}event.filter`)),
            'verbs': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}verbs`)),
        }
    },
}
