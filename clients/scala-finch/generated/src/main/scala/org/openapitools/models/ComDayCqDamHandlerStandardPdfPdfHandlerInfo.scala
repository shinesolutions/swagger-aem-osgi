package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamHandlerStandardPdfPdfHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamHandlerStandardPdfPdfHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamHandlerStandardPdfPdfHandlerProperties]
                )

object ComDayCqDamHandlerStandardPdfPdfHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqDamHandlerStandardPdfPdfHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamHandlerStandardPdfPdfHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamHandlerStandardPdfPdfHandlerInfo] = deriveEncoder
}
