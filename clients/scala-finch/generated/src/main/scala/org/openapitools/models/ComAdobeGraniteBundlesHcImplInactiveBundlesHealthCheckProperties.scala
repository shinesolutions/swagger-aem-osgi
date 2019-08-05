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
 * @param ignoredPeriodbundles 
 */
case class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray],
                ignoredPeriodbundles: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties] = deriveEncoder
}
