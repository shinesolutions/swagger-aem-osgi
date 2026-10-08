const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}cq.social.console.analytics.sites.mapping`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}priority`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.social.console.analytics.sites.mapping': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.social.console.analytics.sites.mapping`)),
            'priority': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}priority`)),
        }
    },
}
