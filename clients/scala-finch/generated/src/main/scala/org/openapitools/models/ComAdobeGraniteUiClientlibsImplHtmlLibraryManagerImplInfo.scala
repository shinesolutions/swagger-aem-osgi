package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo] = deriveEncoder
}
