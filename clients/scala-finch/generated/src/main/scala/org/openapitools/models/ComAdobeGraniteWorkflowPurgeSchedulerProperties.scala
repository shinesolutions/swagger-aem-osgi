package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param scheduledpurgePeriodname 
 * @param scheduledpurgePeriodworkflowStatus 
 * @param scheduledpurgePeriodmodelIds 
 * @param scheduledpurgePerioddaysold 
 */
case class ComAdobeGraniteWorkflowPurgeSchedulerProperties(scheduledpurgePeriodname: Option[ConfigNodePropertyString],
                scheduledpurgePeriodworkflowStatus: Option[ConfigNodePropertyDropDown],
                scheduledpurgePeriodmodelIds: Option[ConfigNodePropertyArray],
                scheduledpurgePerioddaysold: Option[ConfigNodePropertyInteger]
                )

object ComAdobeGraniteWorkflowPurgeSchedulerProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowPurgeSchedulerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowPurgeSchedulerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowPurgeSchedulerProperties] = deriveEncoder
}
