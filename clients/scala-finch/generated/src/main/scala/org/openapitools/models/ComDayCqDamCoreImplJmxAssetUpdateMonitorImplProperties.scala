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
 * @param jmxPeriodobjectname 
 * @param active 
 */
case class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties(jmxPeriodobjectname: Option[ConfigNodePropertyString],
                active: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties] = deriveEncoder
}
