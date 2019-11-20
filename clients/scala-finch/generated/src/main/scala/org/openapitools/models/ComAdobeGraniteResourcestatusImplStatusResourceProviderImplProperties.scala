package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param providerPeriodroot 
 */
case class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties(providerPeriodroot: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties] = deriveEncoder
}