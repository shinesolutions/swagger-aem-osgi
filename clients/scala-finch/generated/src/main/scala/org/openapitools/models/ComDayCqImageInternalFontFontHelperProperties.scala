package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param fontpath 
 * @param oversamplingFactor 
 */
case class ComDayCqImageInternalFontFontHelperProperties(fontpath: Option[ConfigNodePropertyArray],
                oversamplingFactor: Option[ConfigNodePropertyInteger]
                )

object ComDayCqImageInternalFontFontHelperProperties {
    /**
     * Creates the codec for converting ComDayCqImageInternalFontFontHelperProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqImageInternalFontFontHelperProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqImageInternalFontFontHelperProperties] = deriveEncoder
}
