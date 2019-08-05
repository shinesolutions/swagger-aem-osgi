package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWidgetImplWidgetExtensionProviderImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWidgetImplWidgetExtensionProviderImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWidgetImplWidgetExtensionProviderImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWidgetImplWidgetExtensionProviderImplInfo {
    /**
     * Creates the codec for converting ComDayCqWidgetImplWidgetExtensionProviderImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWidgetImplWidgetExtensionProviderImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWidgetImplWidgetExtensionProviderImplInfo] = deriveEncoder
}
