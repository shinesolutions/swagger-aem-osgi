package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties]
                )

object ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo] = deriveEncoder
}
