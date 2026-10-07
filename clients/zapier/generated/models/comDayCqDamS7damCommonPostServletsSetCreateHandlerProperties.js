const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}sling.post.operation`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.servlet.methods`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'sling.post.operation': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.post.operation`)),
            'sling.servlet.methods': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.servlet.methods`)),
        }
    },
}
