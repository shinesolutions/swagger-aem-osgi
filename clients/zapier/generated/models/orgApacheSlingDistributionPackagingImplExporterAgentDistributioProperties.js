const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}queue`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}drop.invalid.items`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}agent.target`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}name`)),
            'queue': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}queue`)),
            'drop.invalid.items': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}drop.invalid.items`)),
            'agent.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}agent.target`)),
        }
    },
}
