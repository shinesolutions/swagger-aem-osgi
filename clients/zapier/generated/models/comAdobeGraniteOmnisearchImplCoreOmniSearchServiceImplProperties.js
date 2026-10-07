const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}omnisearch.suggestion.requiretext.min`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}omnisearch.suggestion.spellcheck.require`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'omnisearch.suggestion.requiretext.min': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}omnisearch.suggestion.requiretext.min`)),
            'omnisearch.suggestion.spellcheck.require': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}omnisearch.suggestion.spellcheck.require`)),
        }
    },
}
