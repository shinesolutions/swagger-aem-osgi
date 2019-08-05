package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param securityPeriodpreferencesPeriodname 
 */
case class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties(securityPeriodpreferencesPeriodname: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties] = deriveEncoder
}
