const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.dam.allow.all.mime`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.dam.allowed.asset.mimes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.dam.allow.all.mime': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.dam.allow.all.mime`)),
            'cq.dam.allowed.asset.mimes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.dam.allowed.asset.mimes`)),
        }
    },
}
