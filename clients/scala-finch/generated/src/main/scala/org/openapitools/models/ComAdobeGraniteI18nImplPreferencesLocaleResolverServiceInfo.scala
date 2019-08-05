package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties]
                )

object ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo] = deriveEncoder
}
