package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo] = deriveEncoder
}
