const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}scheduler.expression`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxSavedActivities`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}saveInterval`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enableActivityPurge`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}eventTypes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'scheduler.expression': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}scheduler.expression`)),
            'maxSavedActivities': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxSavedActivities`)),
            'saveInterval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}saveInterval`)),
            'enableActivityPurge': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enableActivityPurge`)),
            'eventTypes': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}eventTypes`)),
        }
    },
}
