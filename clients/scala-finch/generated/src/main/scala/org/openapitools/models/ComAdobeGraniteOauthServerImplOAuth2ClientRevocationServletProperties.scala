package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param oauthPeriodclientPeriodrevocationPeriodactive 
 */
case class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties(oauthPeriodclientPeriodrevocationPeriodactive: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties] = deriveEncoder
}
