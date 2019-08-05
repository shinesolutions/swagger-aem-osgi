package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties]
                )

object ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo] = deriveEncoder
}
