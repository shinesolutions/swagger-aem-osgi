package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplWarpTimeWarpFilterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWcmCoreImplWarpTimeWarpFilterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplWarpTimeWarpFilterProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmCoreImplWarpTimeWarpFilterInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplWarpTimeWarpFilterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplWarpTimeWarpFilterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplWarpTimeWarpFilterInfo] = deriveEncoder
}
