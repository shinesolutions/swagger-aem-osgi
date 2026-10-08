const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}archiving.enabled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}scheduler.expression`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}archive.since.days.completed`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'archiving.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}archiving.enabled`)),
            'scheduler.expression': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}scheduler.expression`)),
            'archive.since.days.completed': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}archive.since.days.completed`)),
        }
    },
}
