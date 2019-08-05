package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties]
                )

object ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo] = deriveEncoder
}
