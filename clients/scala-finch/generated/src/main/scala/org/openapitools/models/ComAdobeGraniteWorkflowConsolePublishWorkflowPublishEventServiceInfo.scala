package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties]
                )

object ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo] = deriveEncoder
}
