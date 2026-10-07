const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}servlet.post.dateFormats`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}servlet.post.nodeNameHints`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}servlet.post.nodeNameMaxLength`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}servlet.post.checkinNewVersionableNodes`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}servlet.post.autoCheckout`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}servlet.post.autoCheckin`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}servlet.post.ignorePattern`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'servlet.post.dateFormats': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}servlet.post.dateFormats`)),
            'servlet.post.nodeNameHints': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}servlet.post.nodeNameHints`)),
            'servlet.post.nodeNameMaxLength': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}servlet.post.nodeNameMaxLength`)),
            'servlet.post.checkinNewVersionableNodes': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}servlet.post.checkinNewVersionableNodes`)),
            'servlet.post.autoCheckout': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}servlet.post.autoCheckout`)),
            'servlet.post.autoCheckin': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}servlet.post.autoCheckin`)),
            'servlet.post.ignorePattern': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}servlet.post.ignorePattern`)),
        }
    },
}
