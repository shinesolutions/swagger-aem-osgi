package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamInddProcessINDDMediaExtractProcessProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamInddProcessINDDMediaExtractProcessInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamInddProcessINDDMediaExtractProcessProperties]
                )

object ComDayCqDamInddProcessINDDMediaExtractProcessInfo {
    /**
     * Creates the codec for converting ComDayCqDamInddProcessINDDMediaExtractProcessInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamInddProcessINDDMediaExtractProcessInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamInddProcessINDDMediaExtractProcessInfo] = deriveEncoder
}
