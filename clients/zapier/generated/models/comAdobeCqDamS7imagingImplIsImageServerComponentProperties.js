const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}TcpPort`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}AllowRemoteAccess`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}MaxRenderRgnPixels`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}MaxMessageSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}RandomAccessUrlTimeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}WorkerThreads`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'TcpPort': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}TcpPort`)),
            'AllowRemoteAccess': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}AllowRemoteAccess`)),
            'MaxRenderRgnPixels': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}MaxRenderRgnPixels`)),
            'MaxMessageSize': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}MaxMessageSize`)),
            'RandomAccessUrlTimeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}RandomAccessUrlTimeout`)),
            'WorkerThreads': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}WorkerThreads`)),
        }
    },
}
