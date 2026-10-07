const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}sling.content.disposition.paths`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}sling.content.disposition.excluded.paths`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}sling.content.disposition.all.paths`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'sling.content.disposition.paths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}sling.content.disposition.paths`)),
            'sling.content.disposition.excluded.paths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}sling.content.disposition.excluded.paths`)),
            'sling.content.disposition.all.paths': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}sling.content.disposition.all.paths`)),
        }
    },
}
