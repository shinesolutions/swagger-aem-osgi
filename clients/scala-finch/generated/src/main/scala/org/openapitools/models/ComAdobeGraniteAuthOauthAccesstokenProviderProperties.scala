package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param name 
 * @param authPeriodtokenPeriodproviderPeriodtitle 
 * @param authPeriodtokenPeriodproviderPerioddefaultPeriodclaims 
 * @param authPeriodtokenPeriodproviderPeriodendpoint 
 * @param authPeriodaccessPeriodtokenPeriodrequest 
 * @param authPeriodtokenPeriodproviderPeriodkeypairPeriodalias 
 * @param authPeriodtokenPeriodproviderPeriodconnPeriodtimeout 
 * @param authPeriodtokenPeriodproviderPeriodsoPeriodtimeout 
 * @param authPeriodtokenPeriodproviderPeriodclientPeriodid 
 * @param authPeriodtokenPeriodproviderPeriodscope 
 * @param authPeriodtokenPeriodproviderPeriodreusePeriodaccessPeriodtoken 
 * @param authPeriodtokenPeriodproviderPeriodrelaxedPeriodssl 
 * @param tokenPeriodrequestPeriodcustomizerPeriodtype 
 * @param authPeriodtokenPeriodvalidatorPeriodtype 
 */
case class ComAdobeGraniteAuthOauthAccesstokenProviderProperties(name: Option[ConfigNodePropertyString],
                authPeriodtokenPeriodproviderPeriodtitle: Option[ConfigNodePropertyString],
                authPeriodtokenPeriodproviderPerioddefaultPeriodclaims: Option[ConfigNodePropertyArray],
                authPeriodtokenPeriodproviderPeriodendpoint: Option[ConfigNodePropertyString],
                authPeriodaccessPeriodtokenPeriodrequest: Option[ConfigNodePropertyString],
                authPeriodtokenPeriodproviderPeriodkeypairPeriodalias: Option[ConfigNodePropertyString],
                authPeriodtokenPeriodproviderPeriodconnPeriodtimeout: Option[ConfigNodePropertyInteger],
                authPeriodtokenPeriodproviderPeriodsoPeriodtimeout: Option[ConfigNodePropertyInteger],
                authPeriodtokenPeriodproviderPeriodclientPeriodid: Option[ConfigNodePropertyString],
                authPeriodtokenPeriodproviderPeriodscope: Option[ConfigNodePropertyString],
                authPeriodtokenPeriodproviderPeriodreusePeriodaccessPeriodtoken: Option[ConfigNodePropertyBoolean],
                authPeriodtokenPeriodproviderPeriodrelaxedPeriodssl: Option[ConfigNodePropertyBoolean],
                tokenPeriodrequestPeriodcustomizerPeriodtype: Option[ConfigNodePropertyString],
                authPeriodtokenPeriodvalidatorPeriodtype: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteAuthOauthAccesstokenProviderProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthAccesstokenProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthAccesstokenProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthAccesstokenProviderProperties] = deriveEncoder
}
