const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}watchwords.positive`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}watchwords.negative`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}watchwords.path`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sentiment.path`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'watchwords.positive': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}watchwords.positive`)),
            'watchwords.negative': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}watchwords.negative`)),
            'watchwords.path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}watchwords.path`)),
            'sentiment.path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sentiment.path`)),
        }
    },
}
