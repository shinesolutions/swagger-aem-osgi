package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param compatgroups 
 * @param enabled 
 */
case class ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties(compatgroups: Option[ConfigNodePropertyArray],
                enabled: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties] = deriveEncoder
}
