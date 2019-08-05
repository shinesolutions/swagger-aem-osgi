package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo] = deriveEncoder
}
