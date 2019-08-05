package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties]
                )

object ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo] = deriveEncoder
}
