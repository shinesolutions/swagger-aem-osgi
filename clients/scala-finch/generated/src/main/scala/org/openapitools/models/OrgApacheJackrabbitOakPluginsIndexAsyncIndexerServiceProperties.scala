package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param asyncConfigs 
 * @param leaseTimeOutMinutes 
 * @param failingIndexTimeoutSeconds 
 * @param errorWarnIntervalSeconds 
 */
case class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties(asyncConfigs: Option[ConfigNodePropertyArray],
                leaseTimeOutMinutes: Option[ConfigNodePropertyInteger],
                failingIndexTimeoutSeconds: Option[ConfigNodePropertyInteger],
                errorWarnIntervalSeconds: Option[ConfigNodePropertyInteger]
                )

object OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties] = deriveEncoder
}
