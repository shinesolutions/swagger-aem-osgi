const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}service.ranking`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cdnrewriter.attributes`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cdn.rewriter.distribution.domain`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'service.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}service.ranking`)),
            'cdnrewriter.attributes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cdnrewriter.attributes`)),
            'cdn.rewriter.distribution.domain': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cdn.rewriter.distribution.domain`)),
        }
    },
}
