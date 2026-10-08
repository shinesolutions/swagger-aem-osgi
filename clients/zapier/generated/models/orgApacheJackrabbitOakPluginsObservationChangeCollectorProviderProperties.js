const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}maxItems`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxPathDepth`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enabled`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'maxItems': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxItems`)),
            'maxPathDepth': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxPathDepth`)),
            'enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enabled`)),
        }
    },
}
