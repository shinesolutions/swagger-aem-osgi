const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}servletresolver.servletRoot`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}servletresolver.cacheSize`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}servletresolver.paths`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}servletresolver.defaultExtensions`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'servletresolver.servletRoot': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}servletresolver.servletRoot`)),
            'servletresolver.cacheSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}servletresolver.cacheSize`)),
            'servletresolver.paths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}servletresolver.paths`)),
            'servletresolver.defaultExtensions': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}servletresolver.defaultExtensions`)),
        }
    },
}
