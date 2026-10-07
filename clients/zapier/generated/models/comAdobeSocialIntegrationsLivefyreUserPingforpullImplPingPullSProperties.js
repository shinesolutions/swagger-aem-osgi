const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}communities.integration.livefyre.sling.event.filter`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'communities.integration.livefyre.sling.event.filter': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}communities.integration.livefyre.sling.event.filter`)),
        }
    },
}
