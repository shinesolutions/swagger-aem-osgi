package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo {
    /**
     * Creates the codec for converting ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo] = deriveEncoder
}
