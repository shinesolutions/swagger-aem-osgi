package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param scope 
 */
case class ComDayCqWcmCoreImplServletsFindReplaceServletProperties(scope: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmCoreImplServletsFindReplaceServletProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplServletsFindReplaceServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplServletsFindReplaceServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplServletsFindReplaceServletProperties] = deriveEncoder
}
