package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param oauthPeriodproviderPeriodid 
 */
case class ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties(oauthPeriodproviderPeriodid: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties] = deriveEncoder
}
