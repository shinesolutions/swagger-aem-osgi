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
 * @param oauthPeriodconfigPeriodid 
 * @param oauthPeriodclientPeriodid 
 * @param oauthPeriodclientPeriodsecret 
 * @param oauthPeriodscope 
 * @param oauthPeriodconfigPeriodproviderPeriodid 
 * @param oauthPeriodcreatePeriodusers 
 * @param oauthPerioduseridPeriodproperty 
 * @param forcePeriodstrictPeriodusernamePeriodmatching 
 * @param oauthPeriodencodePerioduserids 
 * @param oauthPeriodhashPerioduserids 
 * @param oauthPeriodcallBackUrl 
 * @param oauthPeriodaccessPeriodtokenPeriodpersist 
 * @param oauthPeriodaccessPeriodtokenPeriodpersistPeriodcookie 
 * @param oauthPeriodcsrfPeriodstatePeriodprotection 
 * @param oauthPeriodredirectPeriodrequestPeriodparams 
 * @param oauthPeriodconfigPeriodsiblingsPeriodallow 
 */
case class ComAdobeGraniteAuthOauthProviderProperties(oauthPeriodconfigPeriodid: Option[ConfigNodePropertyString],
                oauthPeriodclientPeriodid: Option[ConfigNodePropertyString],
                oauthPeriodclientPeriodsecret: Option[ConfigNodePropertyString],
                oauthPeriodscope: Option[ConfigNodePropertyArray],
                oauthPeriodconfigPeriodproviderPeriodid: Option[ConfigNodePropertyString],
                oauthPeriodcreatePeriodusers: Option[ConfigNodePropertyBoolean],
                oauthPerioduseridPeriodproperty: Option[ConfigNodePropertyString],
                forcePeriodstrictPeriodusernamePeriodmatching: Option[ConfigNodePropertyBoolean],
                oauthPeriodencodePerioduserids: Option[ConfigNodePropertyBoolean],
                oauthPeriodhashPerioduserids: Option[ConfigNodePropertyBoolean],
                oauthPeriodcallBackUrl: Option[ConfigNodePropertyString],
                oauthPeriodaccessPeriodtokenPeriodpersist: Option[ConfigNodePropertyBoolean],
                oauthPeriodaccessPeriodtokenPeriodpersistPeriodcookie: Option[ConfigNodePropertyBoolean],
                oauthPeriodcsrfPeriodstatePeriodprotection: Option[ConfigNodePropertyBoolean],
                oauthPeriodredirectPeriodrequestPeriodparams: Option[ConfigNodePropertyBoolean],
                oauthPeriodconfigPeriodsiblingsPeriodallow: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteAuthOauthProviderProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthProviderProperties] = deriveEncoder
}
