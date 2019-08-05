package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param oauthPeriodcookiePeriodloginPeriodtimeout 
 * @param oauthPeriodcookiePeriodmaxPeriodage 
 */
case class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties(oauthPeriodcookiePeriodloginPeriodtimeout: Option[ConfigNodePropertyString],
                oauthPeriodcookiePeriodmaxPeriodage: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties] = deriveEncoder
}
