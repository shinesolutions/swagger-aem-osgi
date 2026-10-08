const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}scheduler.period`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}scheduler.concurrent`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}path`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}workspace`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}keywordsPath`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}asyncEntries`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'scheduler.period': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}scheduler.period`)),
            'scheduler.concurrent': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}scheduler.concurrent`)),
            'path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path`)),
            'workspace': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}workspace`)),
            'keywordsPath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}keywordsPath`)),
            'asyncEntries': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}asyncEntries`)),
        }
    },
}
