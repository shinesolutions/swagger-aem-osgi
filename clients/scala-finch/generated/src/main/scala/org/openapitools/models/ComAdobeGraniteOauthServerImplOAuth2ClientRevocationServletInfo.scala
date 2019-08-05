package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties]
                )

object ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo] = deriveEncoder
}
