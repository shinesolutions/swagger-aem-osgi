package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param validationPeriodenabled 
 */
case class ComDayCqTaggingImplJcrTagManagerFactoryImplProperties(validationPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqTaggingImplJcrTagManagerFactoryImplProperties {
    /**
     * Creates the codec for converting ComDayCqTaggingImplJcrTagManagerFactoryImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqTaggingImplJcrTagManagerFactoryImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqTaggingImplJcrTagManagerFactoryImplProperties] = deriveEncoder
}
