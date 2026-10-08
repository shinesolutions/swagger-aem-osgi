const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}org.apache.sling.installer.configuration.persist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}job.consumermanager.whitelist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}job.consumermanager.blacklist`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'org.apache.sling.installer.configuration.persist': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}org.apache.sling.installer.configuration.persist`)),
            'job.consumermanager.whitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}job.consumermanager.whitelist`)),
            'job.consumermanager.blacklist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}job.consumermanager.blacklist`)),
        }
    },
}
