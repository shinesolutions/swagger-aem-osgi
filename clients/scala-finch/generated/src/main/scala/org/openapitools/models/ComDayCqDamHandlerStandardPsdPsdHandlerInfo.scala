package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamHandlerStandardPsdPsdHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamHandlerStandardPsdPsdHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamHandlerStandardPsdPsdHandlerProperties]
                )

object ComDayCqDamHandlerStandardPsdPsdHandlerInfo {
    /**
     * Creates the codec for converting ComDayCqDamHandlerStandardPsdPsdHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamHandlerStandardPsdPsdHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamHandlerStandardPsdPsdHandlerInfo] = deriveEncoder
}
