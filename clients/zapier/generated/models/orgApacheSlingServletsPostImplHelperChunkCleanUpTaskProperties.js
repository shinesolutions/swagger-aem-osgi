const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}scheduler.expression`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}scheduler.concurrent`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}chunk.cleanup.age`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'scheduler.expression': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}scheduler.expression`)),
            'scheduler.concurrent': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}scheduler.concurrent`)),
            'chunk.cleanup.age': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}chunk.cleanup.age`)),
        }
    },
}
