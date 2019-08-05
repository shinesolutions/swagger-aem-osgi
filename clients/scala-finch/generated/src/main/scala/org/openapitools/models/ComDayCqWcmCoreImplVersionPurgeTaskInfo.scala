package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplVersionPurgeTaskProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplVersionPurgeTaskInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplVersionPurgeTaskProperties]
                )

object ComDayCqWcmCoreImplVersionPurgeTaskInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplVersionPurgeTaskInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplVersionPurgeTaskInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplVersionPurgeTaskInfo] = deriveEncoder
}
