
package org.openapitools.client.model


case class OrgApacheSlingDiscoveryOakConfigProperties (
    _connectorPingTimeout: Option[ConfigNodePropertyInteger],
    _connectorPingInterval: Option[ConfigNodePropertyInteger],
    _discoveryLiteCheckInterval: Option[ConfigNodePropertyInteger],
    _clusterSyncServiceTimeout: Option[ConfigNodePropertyInteger],
    _clusterSyncServiceInterval: Option[ConfigNodePropertyInteger],
    _enableSyncToken: Option[ConfigNodePropertyBoolean],
    _minEventDelay: Option[ConfigNodePropertyInteger],
    _socketConnectTimeout: Option[ConfigNodePropertyInteger],
    _soTimeout: Option[ConfigNodePropertyInteger],
    _topologyConnectorUrls: Option[ConfigNodePropertyArray],
    _topologyConnectorWhitelist: Option[ConfigNodePropertyArray],
    _autoStopLocalLoopEnabled: Option[ConfigNodePropertyBoolean],
    _gzipConnectorRequestsEnabled: Option[ConfigNodePropertyBoolean],
    _hmacEnabled: Option[ConfigNodePropertyBoolean],
    _enableEncryption: Option[ConfigNodePropertyBoolean],
    _sharedKey: Option[ConfigNodePropertyString],
    _hmacSharedKeyTTL: Option[ConfigNodePropertyInteger],
    _backoffStandbyFactor: Option[ConfigNodePropertyString],
    _backoffStableFactor: Option[ConfigNodePropertyString]
)
object OrgApacheSlingDiscoveryOakConfigProperties {
    def toStringBody(var_connectorPingTimeout: Object, var_connectorPingInterval: Object, var_discoveryLiteCheckInterval: Object, var_clusterSyncServiceTimeout: Object, var_clusterSyncServiceInterval: Object, var_enableSyncToken: Object, var_minEventDelay: Object, var_socketConnectTimeout: Object, var_soTimeout: Object, var_topologyConnectorUrls: Object, var_topologyConnectorWhitelist: Object, var_autoStopLocalLoopEnabled: Object, var_gzipConnectorRequestsEnabled: Object, var_hmacEnabled: Object, var_enableEncryption: Object, var_sharedKey: Object, var_hmacSharedKeyTTL: Object, var_backoffStandbyFactor: Object, var_backoffStableFactor: Object) =
        s"""
        | {
        | "connectorPingTimeout":$var_connectorPingTimeout,"connectorPingInterval":$var_connectorPingInterval,"discoveryLiteCheckInterval":$var_discoveryLiteCheckInterval,"clusterSyncServiceTimeout":$var_clusterSyncServiceTimeout,"clusterSyncServiceInterval":$var_clusterSyncServiceInterval,"enableSyncToken":$var_enableSyncToken,"minEventDelay":$var_minEventDelay,"socketConnectTimeout":$var_socketConnectTimeout,"soTimeout":$var_soTimeout,"topologyConnectorUrls":$var_topologyConnectorUrls,"topologyConnectorWhitelist":$var_topologyConnectorWhitelist,"autoStopLocalLoopEnabled":$var_autoStopLocalLoopEnabled,"gzipConnectorRequestsEnabled":$var_gzipConnectorRequestsEnabled,"hmacEnabled":$var_hmacEnabled,"enableEncryption":$var_enableEncryption,"sharedKey":$var_sharedKey,"hmacSharedKeyTTL":$var_hmacSharedKeyTTL,"backoffStandbyFactor":$var_backoffStandbyFactor,"backoffStableFactor":$var_backoffStableFactor
        | }
        """.stripMargin
}
