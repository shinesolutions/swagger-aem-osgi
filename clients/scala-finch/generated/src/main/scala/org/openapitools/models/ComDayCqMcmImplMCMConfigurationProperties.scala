package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param experiencePeriodindirection 
 * @param touchpointPeriodindirection 
 */
case class ComDayCqMcmImplMCMConfigurationProperties(experiencePeriodindirection: Option[ConfigNodePropertyArray],
                touchpointPeriodindirection: Option[ConfigNodePropertyArray]
                )

object ComDayCqMcmImplMCMConfigurationProperties {
    /**
     * Creates the codec for converting ComDayCqMcmImplMCMConfigurationProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMcmImplMCMConfigurationProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMcmImplMCMConfigurationProperties] = deriveEncoder
}
