const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}org.apache.sling.commons.log.file`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}org.apache.sling.commons.log.file.number`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}org.apache.sling.commons.log.file.size`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}org.apache.sling.commons.log.file.buffered`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'org.apache.sling.commons.log.file': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.file`)),
            'org.apache.sling.commons.log.file.number': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.file.number`)),
            'org.apache.sling.commons.log.file.size': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.file.size`)),
            'org.apache.sling.commons.log.file.buffered': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.file.buffered`)),
        }
    },
}
