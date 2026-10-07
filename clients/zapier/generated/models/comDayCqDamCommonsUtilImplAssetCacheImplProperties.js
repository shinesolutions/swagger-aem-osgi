const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}large.file.min`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}cache.apply`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}mime.types`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'large.file.min': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}large.file.min`)),
            'cache.apply': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cache.apply`)),
            'mime.types': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}mime.types`)),
        }
    },
}
