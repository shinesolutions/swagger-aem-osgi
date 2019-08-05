package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param path 
 */
case class ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties(path: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties] = deriveEncoder
}
