package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties]
                )

object ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo] = deriveEncoder
}
