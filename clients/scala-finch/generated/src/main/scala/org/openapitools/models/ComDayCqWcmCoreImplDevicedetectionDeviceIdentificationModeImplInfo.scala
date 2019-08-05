package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties]
                )

object ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo] = deriveEncoder
}
