const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}checkInternval`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}excludeIds`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}encryptPing`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'checkInternval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}checkInternval`)),
            'excludeIds': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}excludeIds`)),
            'encryptPing': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}encryptPing`)),
        }
    },
}
