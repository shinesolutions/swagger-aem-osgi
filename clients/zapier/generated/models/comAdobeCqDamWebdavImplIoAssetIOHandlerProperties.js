const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}service.ranking`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}pathPrefix`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}createVersion`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'service.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}service.ranking`)),
            'pathPrefix': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}pathPrefix`)),
            'createVersion': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}createVersion`)),
        }
    },
}
