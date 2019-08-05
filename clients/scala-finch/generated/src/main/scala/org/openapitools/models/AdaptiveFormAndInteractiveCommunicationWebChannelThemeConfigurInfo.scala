package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties]
                )

object AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo {
    /**
     * Creates the codec for converting AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo from and to JSON.
     */
    implicit val decoder: Decoder[AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo] = deriveEncoder
}
