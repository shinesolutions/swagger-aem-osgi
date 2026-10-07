const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}delete.path.regexps`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}delete.sql2.query`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'delete.path.regexps': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}delete.path.regexps`)),
            'delete.sql2.query': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}delete.sql2.query`)),
        }
    },
}
