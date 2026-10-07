const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}event.filter`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}event.queue.length`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}eventrecorder.enabled`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}eventrecorder.blacklist`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}eventrecorder.eventtypes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event.filter': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}event.filter`)),
            'event.queue.length': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}event.queue.length`)),
            'eventrecorder.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}eventrecorder.enabled`)),
            'eventrecorder.blacklist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}eventrecorder.blacklist`)),
            'eventrecorder.eventtypes': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}eventrecorder.eventtypes`)),
        }
    },
}
