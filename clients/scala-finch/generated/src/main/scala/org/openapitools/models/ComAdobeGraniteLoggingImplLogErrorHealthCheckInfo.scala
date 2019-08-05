package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties]
                )

object ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo] = deriveEncoder
}
