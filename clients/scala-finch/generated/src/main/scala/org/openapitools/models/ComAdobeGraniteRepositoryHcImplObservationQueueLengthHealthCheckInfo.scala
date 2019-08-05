package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties]
                )

object ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo] = deriveEncoder
}
