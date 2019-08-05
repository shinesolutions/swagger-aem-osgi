package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties]
                )

object ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo] = deriveEncoder
}
