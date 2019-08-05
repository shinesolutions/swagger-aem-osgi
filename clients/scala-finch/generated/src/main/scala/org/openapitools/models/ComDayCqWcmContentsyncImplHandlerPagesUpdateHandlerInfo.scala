package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties]
                )

object ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo] = deriveEncoder
}
