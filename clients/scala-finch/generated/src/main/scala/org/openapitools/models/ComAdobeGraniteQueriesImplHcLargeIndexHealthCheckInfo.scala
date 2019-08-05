package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties]
                )

object ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo] = deriveEncoder
}
