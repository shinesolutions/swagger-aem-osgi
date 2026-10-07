const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.commerce.cataloggenerator.bucketsize`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.commerce.cataloggenerator.bucketname`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.commerce.cataloggenerator.excludedtemplateproperties`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.commerce.cataloggenerator.bucketsize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.commerce.cataloggenerator.bucketsize`)),
            'cq.commerce.cataloggenerator.bucketname': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.commerce.cataloggenerator.bucketname`)),
            'cq.commerce.cataloggenerator.excludedtemplateproperties': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.commerce.cataloggenerator.excludedtemplateproperties`)),
        }
    },
}
