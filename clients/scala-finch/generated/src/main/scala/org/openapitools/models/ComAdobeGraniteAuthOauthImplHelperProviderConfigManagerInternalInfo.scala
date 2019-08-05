package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties]
                )

object ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo] = deriveEncoder
}
