const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}locale.default`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}preload.bundles`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}invalidation.delay`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'locale.default': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}locale.default`)),
            'preload.bundles': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}preload.bundles`)),
            'invalidation.delay': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}invalidation.delay`)),
        }
    },
}
