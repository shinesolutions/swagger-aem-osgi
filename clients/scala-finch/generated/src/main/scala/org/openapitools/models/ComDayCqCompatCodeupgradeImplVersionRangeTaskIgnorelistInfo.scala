package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties]
                )

object ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo {
    /**
     * Creates the codec for converting ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo] = deriveEncoder
}
