package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties]
                )

object ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo] = deriveEncoder
}
