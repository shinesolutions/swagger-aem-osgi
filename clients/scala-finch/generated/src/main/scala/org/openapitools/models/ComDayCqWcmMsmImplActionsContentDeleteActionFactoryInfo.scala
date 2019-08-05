package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo {
    /**
     * Creates the codec for converting ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo] = deriveEncoder
}
