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
 * @param oauthPeriodproviderPeriodgithubPeriodauthorizationPeriodurl 
 * @param oauthPeriodproviderPeriodgithubPeriodtokenPeriodurl 
 * @param oauthPeriodproviderPeriodgithubPeriodprofilePeriodurl 
 */
case class ComAdobeGraniteAuthOauthImplGithubProviderImplProperties(oauthPeriodproviderPeriodid: Option[ConfigNodePropertyString],
                oauthPeriodproviderPeriodgithubPeriodauthorizationPeriodurl: Option[ConfigNodePropertyString],
                oauthPeriodproviderPeriodgithubPeriodtokenPeriodurl: Option[ConfigNodePropertyString],
                oauthPeriodproviderPeriodgithubPeriodprofilePeriodurl: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteAuthOauthImplGithubProviderImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthOauthImplGithubProviderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthOauthImplGithubProviderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthOauthImplGithubProviderImplProperties] = deriveEncoder
}
