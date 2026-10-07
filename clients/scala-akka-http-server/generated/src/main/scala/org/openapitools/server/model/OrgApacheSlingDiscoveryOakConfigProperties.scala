package org.openapitools.server.model


/**
 * @param connectorPingTimeout  for example: ''null''
 * @param connectorPingInterval  for example: ''null''
 * @param discoveryLiteCheckInterval  for example: ''null''
 * @param clusterSyncServiceTimeout  for example: ''null''
 * @param clusterSyncServiceInterval  for example: ''null''
 * @param enableSyncToken  for example: ''null''
 * @param minEventDelay  for example: ''null''
 * @param socketConnectTimeout  for example: ''null''
 * @param soTimeout  for example: ''null''
 * @param topologyConnectorUrls  for example: ''null''
 * @param topologyConnectorWhitelist  for example: ''null''
 * @param autoStopLocalLoopEnabled  for example: ''null''
 * @param gzipConnectorRequestsEnabled  for example: ''null''
 * @param hmacEnabled  for example: ''null''
 * @param enableEncryption  for example: ''null''
 * @param sharedKey  for example: ''null''
 * @param hmacSharedKeyTTL  for example: ''null''
 * @param backoffStandbyFactor  for example: ''null''
 * @param backoffStableFactor  for example: ''null''
*/
final case class OrgApacheSlingDiscoveryOakConfigProperties (
  connectorPingTimeout: Option[ConfigNodePropertyInteger] = None,
  connectorPingInterval: Option[ConfigNodePropertyInteger] = None,
  discoveryLiteCheckInterval: Option[ConfigNodePropertyInteger] = None,
  clusterSyncServiceTimeout: Option[ConfigNodePropertyInteger] = None,
  clusterSyncServiceInterval: Option[ConfigNodePropertyInteger] = None,
  enableSyncToken: Option[ConfigNodePropertyBoolean] = None,
  minEventDelay: Option[ConfigNodePropertyInteger] = None,
  socketConnectTimeout: Option[ConfigNodePropertyInteger] = None,
  soTimeout: Option[ConfigNodePropertyInteger] = None,
  topologyConnectorUrls: Option[ConfigNodePropertyArray] = None,
  topologyConnectorWhitelist: Option[ConfigNodePropertyArray] = None,
  autoStopLocalLoopEnabled: Option[ConfigNodePropertyBoolean] = None,
  gzipConnectorRequestsEnabled: Option[ConfigNodePropertyBoolean] = None,
  hmacEnabled: Option[ConfigNodePropertyBoolean] = None,
  enableEncryption: Option[ConfigNodePropertyBoolean] = None,
  sharedKey: Option[ConfigNodePropertyString] = None,
  hmacSharedKeyTTL: Option[ConfigNodePropertyInteger] = None,
  backoffStandbyFactor: Option[ConfigNodePropertyString] = None,
  backoffStableFactor: Option[ConfigNodePropertyString] = None
)

