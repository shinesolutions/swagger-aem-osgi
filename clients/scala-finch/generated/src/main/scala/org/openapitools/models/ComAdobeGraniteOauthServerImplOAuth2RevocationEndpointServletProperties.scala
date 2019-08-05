package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param slingPeriodservletPeriodpaths 
 * @param oauthPeriodrevocationPeriodactive 
 */
case class ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties(slingPeriodservletPeriodpaths: Option[ConfigNodePropertyString],
                oauthPeriodrevocationPeriodactive: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties] = deriveEncoder
}
