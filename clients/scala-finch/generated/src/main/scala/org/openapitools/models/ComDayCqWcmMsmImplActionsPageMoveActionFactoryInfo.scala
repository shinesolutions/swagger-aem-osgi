package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties]
                )

object ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo {
    /**
     * Creates the codec for converting ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo] = deriveEncoder
}
