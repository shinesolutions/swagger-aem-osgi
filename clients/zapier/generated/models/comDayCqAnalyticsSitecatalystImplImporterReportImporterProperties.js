const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}report.fetch.attempts`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}report.fetch.delay`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'report.fetch.attempts': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}report.fetch.attempts`)),
            'report.fetch.delay': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}report.fetch.delay`)),
        }
    },
}
