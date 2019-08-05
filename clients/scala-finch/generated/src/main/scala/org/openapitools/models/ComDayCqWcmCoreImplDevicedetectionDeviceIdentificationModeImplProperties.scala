package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown

/**
 * 
 * @param dimPerioddefaultPeriodmode 
 * @param dimPeriodappcachePeriodenabled 
 */
case class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties(dimPerioddefaultPeriodmode: Option[ConfigNodePropertyDropDown],
                dimPeriodappcachePeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties] = deriveEncoder
}
