const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}defaultConnectorName`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}defaultCategory`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'defaultConnectorName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}defaultConnectorName`)),
            'defaultCategory': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}defaultCategory`)),
        }
    },
}
