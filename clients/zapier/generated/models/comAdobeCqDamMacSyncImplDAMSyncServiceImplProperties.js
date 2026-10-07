const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}com.adobe.cq.dam.mac.sync.damsyncservice.platform`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths`)),
            'com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions`)),
            'com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms`)),
            'com.adobe.cq.dam.mac.sync.damsyncservice.platform': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}com.adobe.cq.dam.mac.sync.damsyncservice.platform`)),
        }
    },
}
