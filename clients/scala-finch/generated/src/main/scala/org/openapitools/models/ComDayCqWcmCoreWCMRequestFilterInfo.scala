package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreWCMRequestFilterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWcmCoreWCMRequestFilterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreWCMRequestFilterProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmCoreWCMRequestFilterInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreWCMRequestFilterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreWCMRequestFilterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreWCMRequestFilterInfo] = deriveEncoder
}
