package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo {
    /**
     * Creates the codec for converting ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo] = deriveEncoder
}
