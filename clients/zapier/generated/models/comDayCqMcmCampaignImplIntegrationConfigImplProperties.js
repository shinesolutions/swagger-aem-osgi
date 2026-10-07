const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}aem.mcm.campaign.formConstraints`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}aem.mcm.campaign.publicUrl`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}aem.mcm.campaign.relaxedSSL`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'aem.mcm.campaign.formConstraints': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}aem.mcm.campaign.formConstraints`)),
            'aem.mcm.campaign.publicUrl': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}aem.mcm.campaign.publicUrl`)),
            'aem.mcm.campaign.relaxedSSL': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}aem.mcm.campaign.relaxedSSL`)),
        }
    },
}
