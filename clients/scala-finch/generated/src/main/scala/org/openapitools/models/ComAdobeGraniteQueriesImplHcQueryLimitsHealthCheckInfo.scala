package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties]
                )

object ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo] = deriveEncoder
}
