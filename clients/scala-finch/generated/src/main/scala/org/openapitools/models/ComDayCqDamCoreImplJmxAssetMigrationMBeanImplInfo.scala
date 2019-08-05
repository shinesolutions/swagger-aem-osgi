package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo] = deriveEncoder
}
