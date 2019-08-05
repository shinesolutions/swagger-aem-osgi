package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param oauthPeriodproviderPeriodid 
 * @param oauthPeriodproviderPeriodgranitePeriodauthorizationPeriodurl 
 * @param oauthPeriodproviderPeriodgranitePeriodtokenPeriodurl 
 * @param oauthPeriodproviderPeriodgranitePeriodprofilePeriodurl 
 * @param oauthPeriodproviderPeriodgranitePeriodextendedPerioddetailsPeriodurls 
 */
case class ComAdobeGraniteAuthOauthImplGraniteProviderProperties(oauthPeriodproviderPeriodid: Option[ConfigNodePropertyString],
                oauthPeriodproviderPeriodgranitePeriodauthorizationPeriodurl: Option[ConfigNodePropertyString],
                oauthPeriodproviderPeriodgranitePeriodtokenPeriodurl: Option[ConfigNodePropertyString],
                oauthPeriodproviderPeriodgranitePeriodprofilePeriodurl: Option[ConfigNodePropertyString],
                oauthPeriodproviderPeriodgranitePeriodextendedPerioddetailsPeriodurls: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteAuthOauthImplGraniteProviderProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplGraniteProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplGraniteProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplGraniteProviderProperties] = deriveEncoder
}
