package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties]
                )

object ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo] = deriveEncoder
}
