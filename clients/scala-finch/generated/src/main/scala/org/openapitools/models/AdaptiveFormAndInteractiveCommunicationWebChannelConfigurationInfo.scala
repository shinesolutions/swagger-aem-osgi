package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties]
                )

object AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo {
    /**
     * Creates the codec for converting AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo from and to JSON.
     */
    implicit val decoder: Decoder[AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo] = deriveEncoder
}
