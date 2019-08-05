package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties]
                )

object ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo] = deriveEncoder
}
