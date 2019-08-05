package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties]
                )

object ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo {
    /**
     * Creates the codec for converting ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo] = deriveEncoder
}
