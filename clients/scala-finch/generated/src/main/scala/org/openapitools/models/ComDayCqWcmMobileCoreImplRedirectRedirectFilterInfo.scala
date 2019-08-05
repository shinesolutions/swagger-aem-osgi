package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo {
    /**
     * Creates the codec for converting ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo] = deriveEncoder
}
