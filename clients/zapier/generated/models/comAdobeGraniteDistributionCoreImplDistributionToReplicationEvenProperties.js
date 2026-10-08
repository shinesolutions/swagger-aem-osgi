const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}importer.name`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'importer.name': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}importer.name`)),
        }
    },
}
