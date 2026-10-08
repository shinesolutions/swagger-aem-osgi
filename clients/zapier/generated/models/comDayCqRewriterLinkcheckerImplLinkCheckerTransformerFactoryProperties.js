const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}linkcheckertransformer.disableRewriting`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}linkcheckertransformer.disableChecking`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}linkcheckertransformer.mapCacheSize`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}linkcheckertransformer.strictExtensionCheck`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}linkcheckertransformer.stripHtmltExtension`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}linkcheckertransformer.rewriteElements`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}linkcheckertransformer.stripExtensionPathBlacklist`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'linkcheckertransformer.disableRewriting': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}linkcheckertransformer.disableRewriting`)),
            'linkcheckertransformer.disableChecking': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}linkcheckertransformer.disableChecking`)),
            'linkcheckertransformer.mapCacheSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}linkcheckertransformer.mapCacheSize`)),
            'linkcheckertransformer.strictExtensionCheck': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}linkcheckertransformer.strictExtensionCheck`)),
            'linkcheckertransformer.stripHtmltExtension': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}linkcheckertransformer.stripHtmltExtension`)),
            'linkcheckertransformer.rewriteElements': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}linkcheckertransformer.rewriteElements`)),
            'linkcheckertransformer.stripExtensionPathBlacklist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}linkcheckertransformer.stripExtensionPathBlacklist`)),
        }
    },
}
