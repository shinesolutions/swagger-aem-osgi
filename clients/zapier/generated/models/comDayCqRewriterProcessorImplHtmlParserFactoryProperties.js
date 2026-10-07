const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}htmlparser.processTags`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}htmlparser.preserveCamelCase`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'htmlparser.processTags': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}htmlparser.processTags`)),
            'htmlparser.preserveCamelCase': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}htmlparser.preserveCamelCase`)),
        }
    },
}
