package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param showPlaceholder 
 * @param maximumCacheEntries 
 * @param afPeriodscriptingPeriodcompatversion 
 * @param makeFileNameUnique 
 * @param generatingCompliantData 
 */
case class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties(showPlaceholder: Option[ConfigNodePropertyBoolean],
                maximumCacheEntries: Option[ConfigNodePropertyInteger],
                afPeriodscriptingPeriodcompatversion: Option[ConfigNodePropertyDropDown],
                makeFileNameUnique: Option[ConfigNodePropertyBoolean],
                generatingCompliantData: Option[ConfigNodePropertyBoolean]
                )

object AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties {
    /**
     * Creates the codec for converting AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties from and to JSON.
     */
    implicit val decoder: Decoder[AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties] = deriveEncoder
}
