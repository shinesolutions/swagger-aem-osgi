const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.social.content.fragments.services.enabled`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.social.content.fragments.services.waitTimeSeconds`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.social.content.fragments.services.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.social.content.fragments.services.enabled`)),
            'cq.social.content.fragments.services.waitTimeSeconds': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.social.content.fragments.services.waitTimeSeconds`)),
        }
    },
}
