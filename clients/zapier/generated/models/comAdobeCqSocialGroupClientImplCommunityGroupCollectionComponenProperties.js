const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}group.listing.pagination.enable`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}group.listing.lazyloading.enable`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}page.size`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}priority`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'group.listing.pagination.enable': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}group.listing.pagination.enable`)),
            'group.listing.lazyloading.enable': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}group.listing.lazyloading.enable`)),
            'page.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}page.size`)),
            'priority': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}priority`)),
        }
    },
}
