package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo {
    /**
     * Creates the codec for converting ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo] = deriveEncoder
}
