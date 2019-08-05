package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo] = deriveEncoder
}
