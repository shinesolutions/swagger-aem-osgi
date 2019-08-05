package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param path 
 * @param servicePeriodranking 
 * @param jaasPeriodcontrolFlag 
 * @param jaasPeriodrealmName 
 * @param jaasPeriodranking 
 * @param headers 
 * @param cookies 
 * @param parameters 
 * @param usermap 
 * @param format 
 * @param trustedCredentialsAttribute 
 */
case class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties(path: Option[ConfigNodePropertyString],
                servicePeriodranking: Option[ConfigNodePropertyInteger],
                jaasPeriodcontrolFlag: Option[ConfigNodePropertyString],
                jaasPeriodrealmName: Option[ConfigNodePropertyString],
                jaasPeriodranking: Option[ConfigNodePropertyInteger],
                headers: Option[ConfigNodePropertyArray],
                cookies: Option[ConfigNodePropertyArray],
                parameters: Option[ConfigNodePropertyArray],
                usermap: Option[ConfigNodePropertyArray],
                format: Option[ConfigNodePropertyString],
                trustedCredentialsAttribute: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties] = deriveEncoder
}
