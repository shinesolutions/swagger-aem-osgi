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
case class ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties] = deriveEncoder
}
