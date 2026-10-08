const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}cq.mime.type.blacklist`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.dam.empty.mime`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.mime.type.blacklist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.mime.type.blacklist`)),
            'cq.dam.empty.mime': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.dam.empty.mime`)),
        }
    },
}
