package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param schedulerPeriodexpression 
 * @param maxSavedReports 
 * @param timeDuration 
 * @param enableReportPurge 
 */
case class ComDayCqDamCoreImplReportsReportPurgeServiceProperties(schedulerPeriodexpression: Option[ConfigNodePropertyString],
                maxSavedReports: Option[ConfigNodePropertyInteger],
                timeDuration: Option[ConfigNodePropertyInteger],
                enableReportPurge: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplReportsReportPurgeServiceProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplReportsReportPurgeServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplReportsReportPurgeServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplReportsReportPurgeServiceProperties] = deriveEncoder
}
