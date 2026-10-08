const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}illegalCharMapping`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}pageSubTreeActivationCheck`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'illegalCharMapping': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}illegalCharMapping`)),
            'pageSubTreeActivationCheck': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}pageSubTreeActivationCheck`)),
        }
    },
}
