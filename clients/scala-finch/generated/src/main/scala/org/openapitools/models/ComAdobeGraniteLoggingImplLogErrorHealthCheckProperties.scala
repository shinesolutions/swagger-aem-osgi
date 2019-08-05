package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param hcPeriodtags 
 */
case class ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties] = deriveEncoder
}
