package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties]
                )

object ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo] = deriveEncoder
}
