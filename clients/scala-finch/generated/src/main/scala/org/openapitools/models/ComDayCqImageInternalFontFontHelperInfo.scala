package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqImageInternalFontFontHelperProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqImageInternalFontFontHelperInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqImageInternalFontFontHelperProperties]
                )

object ComDayCqImageInternalFontFontHelperInfo {
    /**
     * Creates the codec for converting ComDayCqImageInternalFontFontHelperInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqImageInternalFontFontHelperInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqImageInternalFontFontHelperInfo] = deriveEncoder
}
