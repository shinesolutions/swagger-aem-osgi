package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmMsmImplRolloutManagerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param additionalProperties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWcmMsmImplRolloutManagerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmMsmImplRolloutManagerImplProperties],
                additionalProperties: Option[String],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmMsmImplRolloutManagerImplInfo {
    /**
     * Creates the codec for converting ComDayCqWcmMsmImplRolloutManagerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMsmImplRolloutManagerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMsmImplRolloutManagerImplInfo] = deriveEncoder
}
