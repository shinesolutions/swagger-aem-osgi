package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties]
                )

object ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo] = deriveEncoder
}
