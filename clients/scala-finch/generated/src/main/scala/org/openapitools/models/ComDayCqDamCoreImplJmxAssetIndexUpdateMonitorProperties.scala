package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyFloat
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param jmxPeriodobjectname 
 * @param propertyPeriodmeasurePeriodenabled 
 * @param propertyPeriodname 
 * @param propertyPeriodmaxPeriodwaitPeriodms 
 * @param propertyPeriodmaxPeriodrate 
 * @param fulltextPeriodmeasurePeriodenabled 
 * @param fulltextPeriodname 
 * @param fulltextPeriodmaxPeriodwaitPeriodms 
 * @param fulltextPeriodmaxPeriodrate 
 */
case class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties(jmxPeriodobjectname: Option[ConfigNodePropertyString],
                propertyPeriodmeasurePeriodenabled: Option[ConfigNodePropertyBoolean],
                propertyPeriodname: Option[ConfigNodePropertyString],
                propertyPeriodmaxPeriodwaitPeriodms: Option[ConfigNodePropertyInteger],
                propertyPeriodmaxPeriodrate: Option[ConfigNodePropertyFloat],
                fulltextPeriodmeasurePeriodenabled: Option[ConfigNodePropertyBoolean],
                fulltextPeriodname: Option[ConfigNodePropertyString],
                fulltextPeriodmaxPeriodwaitPeriodms: Option[ConfigNodePropertyInteger],
                fulltextPeriodmaxPeriodrate: Option[ConfigNodePropertyFloat]
                )

object ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties] = deriveEncoder
}
