const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}alloworigin`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}alloworiginregexp`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}allowedpaths`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}exposedheaders`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxage`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}supportedheaders`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}supportedmethods`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}supportscredentials`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'alloworigin': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}alloworigin`)),
            'alloworiginregexp': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}alloworiginregexp`)),
            'allowedpaths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}allowedpaths`)),
            'exposedheaders': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}exposedheaders`)),
            'maxage': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxage`)),
            'supportedheaders': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}supportedheaders`)),
            'supportedmethods': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}supportedmethods`)),
            'supportscredentials': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}supportscredentials`)),
        }
    },
}
