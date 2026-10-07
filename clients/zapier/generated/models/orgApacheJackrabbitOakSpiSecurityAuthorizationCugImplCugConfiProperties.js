const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}cugSupportedPaths`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}cugEnabled`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}configurationRanking`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cugSupportedPaths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cugSupportedPaths`)),
            'cugEnabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cugEnabled`)),
            'configurationRanking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}configurationRanking`)),
        }
    },
}
