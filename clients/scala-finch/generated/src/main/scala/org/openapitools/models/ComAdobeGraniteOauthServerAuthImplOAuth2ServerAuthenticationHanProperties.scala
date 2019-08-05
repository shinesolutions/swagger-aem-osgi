package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param path 
 * @param jaasPeriodcontrolFlag 
 * @param jaasPeriodrealmName 
 * @param jaasPeriodranking 
 * @param oauthPeriodofflinePeriodvalidation 
 */
case class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties(path: Option[ConfigNodePropertyString],
                jaasPeriodcontrolFlag: Option[ConfigNodePropertyString],
                jaasPeriodrealmName: Option[ConfigNodePropertyString],
                jaasPeriodranking: Option[ConfigNodePropertyInteger],
                oauthPeriodofflinePeriodvalidation: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties] = deriveEncoder
}
