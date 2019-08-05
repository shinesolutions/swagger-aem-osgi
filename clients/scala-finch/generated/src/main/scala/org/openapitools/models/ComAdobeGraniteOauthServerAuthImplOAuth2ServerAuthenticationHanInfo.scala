package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties]
                )

object ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo] = deriveEncoder
}
