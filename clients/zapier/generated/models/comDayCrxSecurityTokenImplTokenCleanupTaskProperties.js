const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}enable.token.cleanup.task`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}scheduler.expression`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}batch.size`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'enable.token.cleanup.task': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enable.token.cleanup.task`)),
            'scheduler.expression': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}scheduler.expression`)),
            'batch.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}batch.size`)),
        }
    },
}
