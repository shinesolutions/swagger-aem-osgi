package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteMonitoringImplScriptConfigImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteMonitoringImplScriptConfigImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteMonitoringImplScriptConfigImplProperties]
                )

object ComAdobeGraniteMonitoringImplScriptConfigImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteMonitoringImplScriptConfigImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteMonitoringImplScriptConfigImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteMonitoringImplScriptConfigImplInfo] = deriveEncoder
}
