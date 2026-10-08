const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyFloat = require('../models/configNodePropertyFloat');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}org.apache.felix.eventadmin.ThreadPoolSize`, isInput),
            ...configNodePropertyFloat.fields(`${keyPrefix}org.apache.felix.eventadmin.AsyncToSyncThreadRatio`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}org.apache.felix.eventadmin.Timeout`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}org.apache.felix.eventadmin.RequireTopic`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}org.apache.felix.eventadmin.IgnoreTimeout`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}org.apache.felix.eventadmin.IgnoreTopic`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'org.apache.felix.eventadmin.ThreadPoolSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}org.apache.felix.eventadmin.ThreadPoolSize`)),
            'org.apache.felix.eventadmin.AsyncToSyncThreadRatio': utils.removeIfEmpty(configNodePropertyFloat.mapping(bundle, `${keyPrefix}org.apache.felix.eventadmin.AsyncToSyncThreadRatio`)),
            'org.apache.felix.eventadmin.Timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}org.apache.felix.eventadmin.Timeout`)),
            'org.apache.felix.eventadmin.RequireTopic': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}org.apache.felix.eventadmin.RequireTopic`)),
            'org.apache.felix.eventadmin.IgnoreTimeout': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}org.apache.felix.eventadmin.IgnoreTimeout`)),
            'org.apache.felix.eventadmin.IgnoreTopic': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}org.apache.felix.eventadmin.IgnoreTopic`)),
        }
    },
}
