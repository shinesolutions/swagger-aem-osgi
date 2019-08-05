package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties]
                )

object ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo] = deriveEncoder
}
