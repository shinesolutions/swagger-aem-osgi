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
case class ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties] = deriveEncoder
}
