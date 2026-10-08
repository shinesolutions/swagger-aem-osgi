const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}event.topics`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}event.filter`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}translate.listener.type`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}translate.property.list`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}poolSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxPoolSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}queueSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}keepAliveTime`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event.topics': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}event.topics`)),
            'event.filter': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}event.filter`)),
            'translate.listener.type': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}translate.listener.type`)),
            'translate.property.list': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}translate.property.list`)),
            'poolSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}poolSize`)),
            'maxPoolSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxPoolSize`)),
            'queueSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}queueSize`)),
            'keepAliveTime': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}keepAliveTime`)),
        }
    },
}
