package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param indexingPeriodcriticalPeriodthreshold 
 * @param indexingPeriodwarnPeriodthreshold 
 * @param hcPeriodtags 
 */
case class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties(indexingPeriodcriticalPeriodthreshold: Option[ConfigNodePropertyInteger],
                indexingPeriodwarnPeriodthreshold: Option[ConfigNodePropertyInteger],
                hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties] = deriveEncoder
}
