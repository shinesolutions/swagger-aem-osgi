package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties]
                )

object ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo] = deriveEncoder
}
