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
 * @param maxPeriodqueuedPeriodjobs 
 */
case class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray],
                maxPeriodqueuedPeriodjobs: Option[ConfigNodePropertyInteger]
                )

object ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties] = deriveEncoder
}
