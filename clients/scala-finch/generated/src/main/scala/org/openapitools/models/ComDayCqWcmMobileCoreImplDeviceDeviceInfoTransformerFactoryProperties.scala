package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param devicePeriodinfoPeriodtransformerPeriodenabled 
 * @param devicePeriodinfoPeriodtransformerPeriodcssPeriodstyle 
 */
case class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties(devicePeriodinfoPeriodtransformerPeriodenabled: Option[ConfigNodePropertyBoolean],
                devicePeriodinfoPeriodtransformerPeriodcssPeriodstyle: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties {
    /**
     * Creates the codec for converting ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties] = deriveEncoder
}
