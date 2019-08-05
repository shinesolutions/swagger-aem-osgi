package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param enabled 
 */
case class ComDayCqDamVideoImplServletVideoTestServletProperties(enabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamVideoImplServletVideoTestServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamVideoImplServletVideoTestServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamVideoImplServletVideoTestServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamVideoImplServletVideoTestServletProperties] = deriveEncoder
}
