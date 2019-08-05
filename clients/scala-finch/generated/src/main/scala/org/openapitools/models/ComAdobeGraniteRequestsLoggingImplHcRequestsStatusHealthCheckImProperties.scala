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
case class ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties(hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties] = deriveEncoder
}
