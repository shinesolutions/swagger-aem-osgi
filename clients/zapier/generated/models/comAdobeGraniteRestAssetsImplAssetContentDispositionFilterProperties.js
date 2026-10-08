const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}mime.allowEmpty`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}mime.allowed`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'mime.allowEmpty': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}mime.allowEmpty`)),
            'mime.allowed': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}mime.allowed`)),
        }
    },
}
