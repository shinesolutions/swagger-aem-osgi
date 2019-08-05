package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param forcelocation 
 */
case class ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties(forcelocation: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties {
    /**
     * Creates the codec for converting ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties] = deriveEncoder
}
