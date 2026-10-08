const utils = require('../utils/utils');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyDropDown.fields(`${keyPrefix}tempStorageConfig`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'tempStorageConfig': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}tempStorageConfig`)),
        }
    },
}
