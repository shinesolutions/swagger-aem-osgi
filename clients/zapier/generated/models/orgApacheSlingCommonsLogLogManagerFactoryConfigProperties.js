const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyDropDown.fields(`${keyPrefix}org.apache.sling.commons.log.level`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}org.apache.sling.commons.log.file`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}org.apache.sling.commons.log.pattern`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}org.apache.sling.commons.log.names`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}org.apache.sling.commons.log.additiv`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'org.apache.sling.commons.log.level': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.level`)),
            'org.apache.sling.commons.log.file': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.file`)),
            'org.apache.sling.commons.log.pattern': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.pattern`)),
            'org.apache.sling.commons.log.names': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.names`)),
            'org.apache.sling.commons.log.additiv': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.additiv`)),
        }
    },
}
