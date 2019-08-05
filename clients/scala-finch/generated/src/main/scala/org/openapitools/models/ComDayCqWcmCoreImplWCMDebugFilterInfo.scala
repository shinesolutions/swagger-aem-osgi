package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplWCMDebugFilterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWcmCoreImplWCMDebugFilterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplWCMDebugFilterProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmCoreImplWCMDebugFilterInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplWCMDebugFilterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplWCMDebugFilterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplWCMDebugFilterInfo] = deriveEncoder
}
