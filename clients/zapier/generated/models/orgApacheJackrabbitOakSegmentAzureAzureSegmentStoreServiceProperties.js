const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}accountName`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}containerName`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}accessKey`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}rootPath`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}connectionURL`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'accountName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}accountName`)),
            'containerName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}containerName`)),
            'accessKey': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}accessKey`)),
            'rootPath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}rootPath`)),
            'connectionURL': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}connectionURL`)),
        }
    },
}
