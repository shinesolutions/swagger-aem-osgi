package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param oauthPeriodissuer 
 * @param oauthPeriodaccessPeriodtokenPeriodexpiresPeriodin 
 * @param osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern 
 * @param osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect 
 */
case class ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties(oauthPeriodissuer: Option[ConfigNodePropertyString],
                oauthPeriodaccessPeriodtokenPeriodexpiresPeriodin: Option[ConfigNodePropertyString],
                osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern: Option[ConfigNodePropertyString],
                osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties] = deriveEncoder
}
