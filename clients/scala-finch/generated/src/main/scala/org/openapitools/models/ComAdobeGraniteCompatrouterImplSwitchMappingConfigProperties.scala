package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param group 
 * @param ids 
 */
case class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties(group: Option[ConfigNodePropertyString],
                ids: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties] = deriveEncoder
}
