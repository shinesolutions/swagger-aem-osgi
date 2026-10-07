const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}pathBuilder.target`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}suggest.basepath`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'pathBuilder.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}pathBuilder.target`)),
            'suggest.basepath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}suggest.basepath`)),
        }
    },
}
