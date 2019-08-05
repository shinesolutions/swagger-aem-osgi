package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties]
                )

object ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo] = deriveEncoder
}
