package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplVersionManagerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplVersionManagerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplVersionManagerImplProperties]
                )

object ComDayCqWcmCoreImplVersionManagerImplInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplVersionManagerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplVersionManagerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplVersionManagerImplInfo] = deriveEncoder
}
