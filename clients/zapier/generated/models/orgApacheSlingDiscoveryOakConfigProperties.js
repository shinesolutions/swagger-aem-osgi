const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}connectorPingTimeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}connectorPingInterval`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}discoveryLiteCheckInterval`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}clusterSyncServiceTimeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}clusterSyncServiceInterval`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enableSyncToken`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}minEventDelay`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}socketConnectTimeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}soTimeout`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}topologyConnectorUrls`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}topologyConnectorWhitelist`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}autoStopLocalLoopEnabled`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}gzipConnectorRequestsEnabled`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}hmacEnabled`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enableEncryption`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sharedKey`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}hmacSharedKeyTTL`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}backoffStandbyFactor`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}backoffStableFactor`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'connectorPingTimeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}connectorPingTimeout`)),
            'connectorPingInterval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}connectorPingInterval`)),
            'discoveryLiteCheckInterval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}discoveryLiteCheckInterval`)),
            'clusterSyncServiceTimeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}clusterSyncServiceTimeout`)),
            'clusterSyncServiceInterval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}clusterSyncServiceInterval`)),
            'enableSyncToken': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enableSyncToken`)),
            'minEventDelay': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}minEventDelay`)),
            'socketConnectTimeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}socketConnectTimeout`)),
            'soTimeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}soTimeout`)),
            'topologyConnectorUrls': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}topologyConnectorUrls`)),
            'topologyConnectorWhitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}topologyConnectorWhitelist`)),
            'autoStopLocalLoopEnabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}autoStopLocalLoopEnabled`)),
            'gzipConnectorRequestsEnabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}gzipConnectorRequestsEnabled`)),
            'hmacEnabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}hmacEnabled`)),
            'enableEncryption': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enableEncryption`)),
            'sharedKey': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sharedKey`)),
            'hmacSharedKeyTTL': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}hmacSharedKeyTTL`)),
            'backoffStandbyFactor': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}backoffStandbyFactor`)),
            'backoffStableFactor': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}backoffStableFactor`)),
        }
    },
}
