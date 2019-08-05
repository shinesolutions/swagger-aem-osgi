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
case class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties(oauthPeriodcookiePeriodloginPeriodtimeout: Option[ConfigNodePropertyString],
                oauthPeriodcookiePeriodmaxPeriodage: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties] = deriveEncoder
}
