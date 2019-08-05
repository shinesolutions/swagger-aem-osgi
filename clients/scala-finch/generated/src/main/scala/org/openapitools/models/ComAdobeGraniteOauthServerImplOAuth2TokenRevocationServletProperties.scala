package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param oauthPeriodtokenPeriodrevocationPeriodactive 
 */
case class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties(oauthPeriodtokenPeriodrevocationPeriodactive: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties] = deriveEncoder
}
