package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param jmxPeriodobjectname 
 */
case class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties(jmxPeriodobjectname: Option[ConfigNodePropertyString]
                )

object ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties] = deriveEncoder
}
