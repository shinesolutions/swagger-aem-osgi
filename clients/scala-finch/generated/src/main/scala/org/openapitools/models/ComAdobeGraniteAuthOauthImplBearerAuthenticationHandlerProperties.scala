package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param path 
 * @param oauthPeriodclientIdsPeriodallowed 
 * @param authPeriodbearerPeriodsyncPeriodims 
 * @param authPeriodtokenRequestParameter 
 * @param oauthPeriodbearerPeriodconfigid 
 * @param oauthPeriodjwtPeriodsupport 
 */
case class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties(path: Option[ConfigNodePropertyString],
                oauthPeriodclientIdsPeriodallowed: Option[ConfigNodePropertyArray],
                authPeriodbearerPeriodsyncPeriodims: Option[ConfigNodePropertyBoolean],
                authPeriodtokenRequestParameter: Option[ConfigNodePropertyString],
                oauthPeriodbearerPeriodconfigid: Option[ConfigNodePropertyString],
                oauthPeriodjwtPeriodsupport: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties] = deriveEncoder
}
