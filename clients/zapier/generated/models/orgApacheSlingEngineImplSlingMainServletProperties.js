const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}sling.max.calls`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}sling.max.inclusions`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}sling.trace.allow`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}sling.max.record.requests`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}sling.store.pattern.requests`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.serverinfo`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}sling.additional.response.headers`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'sling.max.calls': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}sling.max.calls`)),
            'sling.max.inclusions': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}sling.max.inclusions`)),
            'sling.trace.allow': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}sling.trace.allow`)),
            'sling.max.record.requests': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}sling.max.record.requests`)),
            'sling.store.pattern.requests': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}sling.store.pattern.requests`)),
            'sling.serverinfo': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.serverinfo`)),
            'sling.additional.response.headers': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}sling.additional.response.headers`)),
        }
    },
}
