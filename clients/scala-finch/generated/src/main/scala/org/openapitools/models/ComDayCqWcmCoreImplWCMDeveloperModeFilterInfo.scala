package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties

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
case class ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties],
                additionalProperties: Option[String],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo] = deriveEncoder
}
