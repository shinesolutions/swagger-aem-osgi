const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}event.filter`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}launches.eventhandler.threadpool.maxsize`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}launches.eventhandler.threadpool.priority`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}launches.eventhandler.updatelastmodification`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event.filter': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}event.filter`)),
            'launches.eventhandler.threadpool.maxsize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}launches.eventhandler.threadpool.maxsize`)),
            'launches.eventhandler.threadpool.priority': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}launches.eventhandler.threadpool.priority`)),
            'launches.eventhandler.updatelastmodification': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}launches.eventhandler.updatelastmodification`)),
        }
    },
}
