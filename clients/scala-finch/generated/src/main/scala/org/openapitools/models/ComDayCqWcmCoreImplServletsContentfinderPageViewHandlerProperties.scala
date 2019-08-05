package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param guessTotal 
 * @param tagTitleSearch 
 */
case class ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties(guessTotal: Option[ConfigNodePropertyString],
                tagTitleSearch: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties] = deriveEncoder
}
