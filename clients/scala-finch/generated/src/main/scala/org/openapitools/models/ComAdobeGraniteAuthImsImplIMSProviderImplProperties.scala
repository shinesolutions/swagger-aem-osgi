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
 * @param oauthPeriodproviderPeriodid 
 * @param oauthPeriodproviderPeriodimsPeriodauthorizationPeriodurl 
 * @param oauthPeriodproviderPeriodimsPeriodtokenPeriodurl 
 * @param oauthPeriodproviderPeriodimsPeriodprofilePeriodurl 
 * @param oauthPeriodproviderPeriodimsPeriodextendedPerioddetailsPeriodurls 
 * @param oauthPeriodproviderPeriodimsPeriodvalidatePeriodtokenPeriodurl 
 * @param oauthPeriodproviderPeriodimsPeriodsessionPeriodproperty 
 * @param oauthPeriodproviderPeriodimsPeriodservicePeriodtokenPeriodclientPeriodid 
 * @param oauthPeriodproviderPeriodimsPeriodservicePeriodtokenPeriodclientPeriodsecret 
 * @param oauthPeriodproviderPeriodimsPeriodservicePeriodtoken 
 * @param imsPeriodorgPeriodref 
 * @param imsPeriodgroupPeriodmapping 
 * @param oauthPeriodproviderPeriodimsPeriodonlyPeriodlicensePeriodgroup 
 */
case class ComAdobeGraniteAuthImsImplIMSProviderImplProperties(oauthPeriodproviderPeriodid: Option[ConfigNodePropertyString],
                oauthPeriodproviderPeriodimsPeriodauthorizationPeriodurl: Option[ConfigNodePropertyString],
                oauthPeriodproviderPeriodimsPeriodtokenPeriodurl: Option[ConfigNodePropertyString],
                oauthPeriodproviderPeriodimsPeriodprofilePeriodurl: Option[ConfigNodePropertyString],
                oauthPeriodproviderPeriodimsPeriodextendedPerioddetailsPeriodurls: Option[ConfigNodePropertyArray],
                oauthPeriodproviderPeriodimsPeriodvalidatePeriodtokenPeriodurl: Option[ConfigNodePropertyString],
                oauthPeriodproviderPeriodimsPeriodsessionPeriodproperty: Option[ConfigNodePropertyString],
                oauthPeriodproviderPeriodimsPeriodservicePeriodtokenPeriodclientPeriodid: Option[ConfigNodePropertyString],
                oauthPeriodproviderPeriodimsPeriodservicePeriodtokenPeriodclientPeriodsecret: Option[ConfigNodePropertyString],
                oauthPeriodproviderPeriodimsPeriodservicePeriodtoken: Option[ConfigNodePropertyString],
                imsPeriodorgPeriodref: Option[ConfigNodePropertyString],
                imsPeriodgroupPeriodmapping: Option[ConfigNodePropertyArray],
                oauthPeriodproviderPeriodimsPeriodonlyPeriodlicensePeriodgroup: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteAuthImsImplIMSProviderImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthImsImplIMSProviderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthImsImplIMSProviderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthImsImplIMSProviderImplProperties] = deriveEncoder
}
