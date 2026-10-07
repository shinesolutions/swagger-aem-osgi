const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}dav.root`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}dav.create-absolute-uri`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}dav.realm`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}collection.types`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}filter.prefixes`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}filter.types`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}filter.uris`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}type.collections`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}type.noncollections`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}type.content`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'dav.root': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}dav.root`)),
            'dav.create-absolute-uri': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}dav.create-absolute-uri`)),
            'dav.realm': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}dav.realm`)),
            'collection.types': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}collection.types`)),
            'filter.prefixes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}filter.prefixes`)),
            'filter.types': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}filter.types`)),
            'filter.uris': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}filter.uris`)),
            'type.collections': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}type.collections`)),
            'type.noncollections': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}type.noncollections`)),
            'type.content': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}type.content`)),
        }
    },
}
