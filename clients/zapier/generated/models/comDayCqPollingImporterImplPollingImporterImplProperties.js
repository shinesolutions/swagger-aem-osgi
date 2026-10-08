const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}importer.min.interval`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}importer.user`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}exclude.paths`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}include.paths`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'importer.min.interval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}importer.min.interval`)),
            'importer.user': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}importer.user`)),
            'exclude.paths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}exclude.paths`)),
            'include.paths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}include.paths`)),
        }
    },
}
