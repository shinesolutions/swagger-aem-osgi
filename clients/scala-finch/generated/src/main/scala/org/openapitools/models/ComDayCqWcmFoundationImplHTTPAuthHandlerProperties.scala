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
 * @param authPeriodhttpPeriodnologin 
 * @param authPeriodhttpPeriodrealm 
 * @param authPerioddefaultPeriodloginpage 
 * @param authPeriodcredPeriodform 
 * @param authPeriodcredPeriodutf8 
 */
case class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties(path: Option[ConfigNodePropertyString],
                authPeriodhttpPeriodnologin: Option[ConfigNodePropertyBoolean],
                authPeriodhttpPeriodrealm: Option[ConfigNodePropertyString],
                authPerioddefaultPeriodloginpage: Option[ConfigNodePropertyString],
                authPeriodcredPeriodform: Option[ConfigNodePropertyArray],
                authPeriodcredPeriodutf8: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmFoundationImplHTTPAuthHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqWcmFoundationImplHTTPAuthHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmFoundationImplHTTPAuthHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmFoundationImplHTTPAuthHandlerProperties] = deriveEncoder
}
