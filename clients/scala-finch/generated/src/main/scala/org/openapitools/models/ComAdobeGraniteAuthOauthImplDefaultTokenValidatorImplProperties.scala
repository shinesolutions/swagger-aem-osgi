package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param authPeriodtokenPeriodvalidatorPeriodtype 
 */
case class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties(authPeriodtokenPeriodvalidatorPeriodtype: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties] = deriveEncoder
}
