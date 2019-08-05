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
case class ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties] = deriveEncoder
}
