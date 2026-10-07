const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}history.requestFilter.excludedSelectors`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}history.requestFilter.excludedExtensions`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'history.requestFilter.excludedSelectors': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}history.requestFilter.excludedSelectors`)),
            'history.requestFilter.excludedExtensions': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}history.requestFilter.excludedExtensions`)),
        }
    },
}
