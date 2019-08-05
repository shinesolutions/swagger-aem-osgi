package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param granitePeriodworkflowPeriodWorkflowPublishEventServicePeriodenabled 
 */
case class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties(granitePeriodworkflowPeriodWorkflowPublishEventServicePeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties] = deriveEncoder
}
