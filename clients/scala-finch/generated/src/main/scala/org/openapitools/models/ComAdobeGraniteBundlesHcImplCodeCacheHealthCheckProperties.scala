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
 * @param hcPeriodtags 
 * @param minimumPeriodcodePeriodcachePeriodsize 
 */
case class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray],
                minimumPeriodcodePeriodcachePeriodsize: Option[ConfigNodePropertyInteger]
                )

object ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties] = deriveEncoder
}
