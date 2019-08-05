package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteWorkflowCorePayloadMapCacheProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteWorkflowCorePayloadMapCacheInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteWorkflowCorePayloadMapCacheProperties]
                )

object ComAdobeGraniteWorkflowCorePayloadMapCacheInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowCorePayloadMapCacheInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowCorePayloadMapCacheInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowCorePayloadMapCacheInfo] = deriveEncoder
}
