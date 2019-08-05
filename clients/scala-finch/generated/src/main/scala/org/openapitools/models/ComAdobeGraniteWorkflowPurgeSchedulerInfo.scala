package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteWorkflowPurgeSchedulerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteWorkflowPurgeSchedulerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteWorkflowPurgeSchedulerProperties]
                )

object ComAdobeGraniteWorkflowPurgeSchedulerInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowPurgeSchedulerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowPurgeSchedulerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowPurgeSchedulerInfo] = deriveEncoder
}
