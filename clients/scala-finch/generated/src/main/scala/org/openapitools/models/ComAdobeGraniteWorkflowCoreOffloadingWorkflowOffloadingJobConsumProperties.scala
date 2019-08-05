package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param jobPeriodtopics 
 */
case class ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties(jobPeriodtopics: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties] = deriveEncoder
}
