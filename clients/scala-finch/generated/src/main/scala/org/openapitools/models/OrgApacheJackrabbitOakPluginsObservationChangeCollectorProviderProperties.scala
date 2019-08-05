package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param maxItems 
 * @param maxPathDepth 
 * @param enabled 
 */
case class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties(maxItems: Option[ConfigNodePropertyInteger],
                maxPathDepth: Option[ConfigNodePropertyInteger],
                enabled: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties] = deriveEncoder
}
