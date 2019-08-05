package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param fontList 
 */
case class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties(fontList: Option[ConfigNodePropertyArray]
                )

object AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties {
    /**
     * Creates the codec for converting AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties from and to JSON.
     */
    implicit val decoder: Decoder[AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties] = deriveEncoder
}
