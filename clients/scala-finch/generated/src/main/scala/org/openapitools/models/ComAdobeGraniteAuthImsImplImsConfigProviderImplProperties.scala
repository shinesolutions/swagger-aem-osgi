package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param oauthPeriodconfigmanagerPeriodimsPeriodconfigid 
 * @param imsPeriodowningEntity 
 * @param aemPeriodinstanceId 
 * @param imsPeriodserviceCode 
 */
case class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties(oauthPeriodconfigmanagerPeriodimsPeriodconfigid: Option[ConfigNodePropertyString],
                imsPeriodowningEntity: Option[ConfigNodePropertyString],
                aemPeriodinstanceId: Option[ConfigNodePropertyString],
                imsPeriodserviceCode: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties] = deriveEncoder
}
