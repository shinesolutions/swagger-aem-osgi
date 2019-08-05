package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo {
    /**
     * Creates the codec for converting ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo] = deriveEncoder
}
