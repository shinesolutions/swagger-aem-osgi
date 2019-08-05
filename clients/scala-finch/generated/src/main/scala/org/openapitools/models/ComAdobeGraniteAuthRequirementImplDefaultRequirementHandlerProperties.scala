package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param supportedPaths 
 */
case class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties(supportedPaths: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties] = deriveEncoder
}
