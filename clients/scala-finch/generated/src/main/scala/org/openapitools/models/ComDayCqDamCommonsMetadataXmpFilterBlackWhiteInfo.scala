package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties]
                )

object ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo {
    /**
     * Creates the codec for converting ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo] = deriveEncoder
}
