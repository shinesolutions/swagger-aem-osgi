package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties]
                )

object ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo] = deriveEncoder
}
