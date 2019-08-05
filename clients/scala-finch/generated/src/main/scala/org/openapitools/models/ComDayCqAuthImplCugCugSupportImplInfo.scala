package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqAuthImplCugCugSupportImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqAuthImplCugCugSupportImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqAuthImplCugCugSupportImplProperties]
                )

object ComDayCqAuthImplCugCugSupportImplInfo {
    /**
     * Creates the codec for converting ComDayCqAuthImplCugCugSupportImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAuthImplCugCugSupportImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAuthImplCugCugSupportImplInfo] = deriveEncoder
}
