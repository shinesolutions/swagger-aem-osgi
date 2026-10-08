const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}host`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}port`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'host': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}host`)),
            'port': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}port`)),
        }
    },
}
