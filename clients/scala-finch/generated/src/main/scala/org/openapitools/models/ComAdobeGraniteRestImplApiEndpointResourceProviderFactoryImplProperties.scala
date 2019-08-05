package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param providerPeriodroots 
 */
case class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties(providerPeriodroots: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties] = deriveEncoder
}
