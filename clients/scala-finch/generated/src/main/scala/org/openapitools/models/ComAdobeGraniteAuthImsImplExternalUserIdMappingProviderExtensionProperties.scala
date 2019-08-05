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
 */
case class ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties(oauthPeriodproviderPeriodid: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties] = deriveEncoder
}
