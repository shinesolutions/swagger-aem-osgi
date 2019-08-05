package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param configid 
 * @param scope 
 */
case class ComAdobeGraniteAuthImsProperties(configid: Option[ConfigNodePropertyString],
                scope: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteAuthImsProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthImsProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthImsProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthImsProperties] = deriveEncoder
}
