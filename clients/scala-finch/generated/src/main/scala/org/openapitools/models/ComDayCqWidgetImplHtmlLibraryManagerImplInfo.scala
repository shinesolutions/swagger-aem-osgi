package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWidgetImplHtmlLibraryManagerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqWidgetImplHtmlLibraryManagerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWidgetImplHtmlLibraryManagerImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqWidgetImplHtmlLibraryManagerImplInfo {
    /**
     * Creates the codec for converting ComDayCqWidgetImplHtmlLibraryManagerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWidgetImplHtmlLibraryManagerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWidgetImplHtmlLibraryManagerImplInfo] = deriveEncoder
}
