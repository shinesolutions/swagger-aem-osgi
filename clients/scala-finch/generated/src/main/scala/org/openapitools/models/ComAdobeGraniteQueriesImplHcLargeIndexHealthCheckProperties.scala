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
 * @param largePeriodindexPeriodcriticalPeriodthreshold 
 * @param largePeriodindexPeriodwarnPeriodthreshold 
 * @param hcPeriodtags 
 */
case class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties(largePeriodindexPeriodcriticalPeriodthreshold: Option[ConfigNodePropertyInteger],
                largePeriodindexPeriodwarnPeriodthreshold: Option[ConfigNodePropertyInteger],
                hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties] = deriveEncoder
}
