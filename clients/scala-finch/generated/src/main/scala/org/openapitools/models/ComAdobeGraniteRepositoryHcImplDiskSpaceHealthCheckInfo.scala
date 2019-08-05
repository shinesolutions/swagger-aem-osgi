package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties]
                )

object ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo] = deriveEncoder
}
