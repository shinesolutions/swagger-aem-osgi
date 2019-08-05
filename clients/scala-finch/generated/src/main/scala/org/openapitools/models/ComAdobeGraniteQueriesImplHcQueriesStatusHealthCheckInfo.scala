package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties]
                )

object ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo] = deriveEncoder
}
