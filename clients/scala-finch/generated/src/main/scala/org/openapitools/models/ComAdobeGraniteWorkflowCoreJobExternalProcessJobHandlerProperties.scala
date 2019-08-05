package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param defaultPeriodtimeout 
 * @param maxPeriodtimeout 
 * @param defaultPeriodperiod 
 */
case class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties(defaultPeriodtimeout: Option[ConfigNodePropertyInteger],
                maxPeriodtimeout: Option[ConfigNodePropertyInteger],
                defaultPeriodperiod: Option[ConfigNodePropertyInteger]
                )

object ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties] = deriveEncoder
}
