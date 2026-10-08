const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}path`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}token.required.attr`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}token.alternate.url`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}token.encapsulated`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}skip.token.refresh`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path`)),
            'token.required.attr': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}token.required.attr`)),
            'token.alternate.url': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}token.alternate.url`)),
            'token.encapsulated': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}token.encapsulated`)),
            'skip.token.refresh': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}skip.token.refresh`)),
        }
    },
}
