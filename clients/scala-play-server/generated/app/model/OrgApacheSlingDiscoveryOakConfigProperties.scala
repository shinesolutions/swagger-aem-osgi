package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDiscoveryOakConfigProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDiscoveryOakConfigProperties(
  connectorPingTimeout: Option[ConfigNodePropertyInteger],
  connectorPingInterval: Option[ConfigNodePropertyInteger],
  discoveryLiteCheckInterval: Option[ConfigNodePropertyInteger],
  clusterSyncServiceTimeout: Option[ConfigNodePropertyInteger],
  clusterSyncServiceInterval: Option[ConfigNodePropertyInteger],
  enableSyncToken: Option[ConfigNodePropertyBoolean],
  minEventDelay: Option[ConfigNodePropertyInteger],
  socketConnectTimeout: Option[ConfigNodePropertyInteger],
  soTimeout: Option[ConfigNodePropertyInteger],
  topologyConnectorUrls: Option[ConfigNodePropertyArray],
  topologyConnectorWhitelist: Option[ConfigNodePropertyArray],
  autoStopLocalLoopEnabled: Option[ConfigNodePropertyBoolean],
  gzipConnectorRequestsEnabled: Option[ConfigNodePropertyBoolean],
  hmacEnabled: Option[ConfigNodePropertyBoolean],
  enableEncryption: Option[ConfigNodePropertyBoolean],
  sharedKey: Option[ConfigNodePropertyString],
  hmacSharedKeyTTL: Option[ConfigNodePropertyInteger],
  backoffStandbyFactor: Option[ConfigNodePropertyString],
  backoffStableFactor: Option[ConfigNodePropertyString]
)

object OrgApacheSlingDiscoveryOakConfigProperties {
  implicit lazy val orgApacheSlingDiscoveryOakConfigPropertiesJsonFormat: Format[OrgApacheSlingDiscoveryOakConfigProperties] = Json.format[OrgApacheSlingDiscoveryOakConfigProperties]
}

