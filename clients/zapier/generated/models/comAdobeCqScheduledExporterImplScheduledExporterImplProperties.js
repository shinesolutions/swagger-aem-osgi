const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}include.paths`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}exporter.user`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'include.paths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}include.paths`)),
            'exporter.user': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}exporter.user`)),
        }
    },
}
