package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param getPeriod 
 */
case class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties(getPeriod: Option[ConfigNodePropertyInteger]
                )

object ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties] = deriveEncoder
}
