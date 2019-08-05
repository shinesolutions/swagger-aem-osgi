package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplReportsReportPurgeServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplReportsReportPurgeServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplReportsReportPurgeServiceProperties]
                )

object ComDayCqDamCoreImplReportsReportPurgeServiceInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplReportsReportPurgeServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplReportsReportPurgeServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplReportsReportPurgeServiceInfo] = deriveEncoder
}
