package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param scheduledpurgePeriodname 
 * @param scheduledpurgePeriodpurgeActive 
 * @param scheduledpurgePeriodtemplates 
 * @param scheduledpurgePeriodpurgeGroups 
 * @param scheduledpurgePeriodpurgeAssets 
 * @param scheduledpurgePeriodterminateRunningWorkflows 
 * @param scheduledpurgePerioddaysold 
 * @param scheduledpurgePeriodsaveThreshold 
 */
case class ComAdobeCqProjectsPurgeSchedulerProperties(scheduledpurgePeriodname: Option[ConfigNodePropertyString],
                scheduledpurgePeriodpurgeActive: Option[ConfigNodePropertyBoolean],
                scheduledpurgePeriodtemplates: Option[ConfigNodePropertyArray],
                scheduledpurgePeriodpurgeGroups: Option[ConfigNodePropertyBoolean],
                scheduledpurgePeriodpurgeAssets: Option[ConfigNodePropertyBoolean],
                scheduledpurgePeriodterminateRunningWorkflows: Option[ConfigNodePropertyBoolean],
                scheduledpurgePerioddaysold: Option[ConfigNodePropertyInteger],
                scheduledpurgePeriodsaveThreshold: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqProjectsPurgeSchedulerProperties {
    /**
     * Creates the codec for converting ComAdobeCqProjectsPurgeSchedulerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqProjectsPurgeSchedulerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqProjectsPurgeSchedulerProperties] = deriveEncoder
}
