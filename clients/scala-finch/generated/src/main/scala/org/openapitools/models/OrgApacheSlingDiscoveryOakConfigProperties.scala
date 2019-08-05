package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param connectorPingTimeout 
 * @param connectorPingInterval 
 * @param discoveryLiteCheckInterval 
 * @param clusterSyncServiceTimeout 
 * @param clusterSyncServiceInterval 
 * @param enableSyncToken 
 * @param minEventDelay 
 * @param socketConnectTimeout 
 * @param soTimeout 
 * @param topologyConnectorUrls 
 * @param topologyConnectorWhitelist 
 * @param autoStopLocalLoopEnabled 
 * @param gzipConnectorRequestsEnabled 
 * @param hmacEnabled 
 * @param enableEncryption 
 * @param sharedKey 
 * @param hmacSharedKeyTTL 
 * @param backoffStandbyFactor 
 * @param backoffStableFactor 
 */
case class OrgApacheSlingDiscoveryOakConfigProperties(connectorPingTimeout: Option[ConfigNodePropertyInteger],
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
    /**
     * Creates the codec for converting OrgApacheSlingDiscoveryOakConfigProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDiscoveryOakConfigProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDiscoveryOakConfigProperties] = deriveEncoder
}
