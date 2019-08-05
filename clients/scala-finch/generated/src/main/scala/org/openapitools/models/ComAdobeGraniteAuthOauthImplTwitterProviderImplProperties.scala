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
case class ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties(oauthPeriodproviderPeriodid: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties] = deriveEncoder
}
