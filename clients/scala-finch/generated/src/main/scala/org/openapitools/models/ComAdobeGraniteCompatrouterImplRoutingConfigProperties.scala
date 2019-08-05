package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param id 
 * @param compatPath 
 * @param newPath 
 */
case class ComAdobeGraniteCompatrouterImplRoutingConfigProperties(id: Option[ConfigNodePropertyString],
                compatPath: Option[ConfigNodePropertyString],
                newPath: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteCompatrouterImplRoutingConfigProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteCompatrouterImplRoutingConfigProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteCompatrouterImplRoutingConfigProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteCompatrouterImplRoutingConfigProperties] = deriveEncoder
}
