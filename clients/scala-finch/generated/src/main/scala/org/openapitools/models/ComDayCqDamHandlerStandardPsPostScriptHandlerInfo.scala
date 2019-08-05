package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamHandlerStandardPsPostScriptHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamHandlerStandardPsPostScriptHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamHandlerStandardPsPostScriptHandlerProperties]
                )

object ComDayCqDamHandlerStandardPsPostScriptHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqDamHandlerStandardPsPostScriptHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamHandlerStandardPsPostScriptHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamHandlerStandardPsPostScriptHandlerInfo] = deriveEncoder
}
