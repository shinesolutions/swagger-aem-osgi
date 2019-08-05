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
 * @param name 
 * @param types 
 */
case class ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties(name: Option[ConfigNodePropertyString],
                types: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties] = deriveEncoder
}
