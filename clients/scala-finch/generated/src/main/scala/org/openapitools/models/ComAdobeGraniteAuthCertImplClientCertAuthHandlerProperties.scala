package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param path 
 * @param servicePeriodranking 
 */
case class ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties(path: Option[ConfigNodePropertyString],
                servicePeriodranking: Option[ConfigNodePropertyInteger]
                )

object ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties] = deriveEncoder
}
