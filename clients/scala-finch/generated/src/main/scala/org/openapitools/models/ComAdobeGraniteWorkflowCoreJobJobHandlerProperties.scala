package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param jobPeriodtopics 
 * @param allowPeriodselfPeriodprocessPeriodtermination 
 */
case class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties(jobPeriodtopics: Option[ConfigNodePropertyArray],
                allowPeriodselfPeriodprocessPeriodtermination: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteWorkflowCoreJobJobHandlerProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowCoreJobJobHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowCoreJobJobHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowCoreJobJobHandlerProperties] = deriveEncoder
}
