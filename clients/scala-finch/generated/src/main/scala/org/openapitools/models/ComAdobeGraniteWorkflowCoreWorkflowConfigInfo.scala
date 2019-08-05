package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteWorkflowCoreWorkflowConfigProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteWorkflowCoreWorkflowConfigInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteWorkflowCoreWorkflowConfigProperties]
                )

object ComAdobeGraniteWorkflowCoreWorkflowConfigInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowCoreWorkflowConfigInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowCoreWorkflowConfigInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowCoreWorkflowConfigInfo] = deriveEncoder
}
