package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties]
                )

object ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo] = deriveEncoder
}
