package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplReportsReportExportServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplReportsReportExportServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplReportsReportExportServiceProperties]
                )

object ComDayCqDamCoreImplReportsReportExportServiceInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplReportsReportExportServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplReportsReportExportServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplReportsReportExportServiceInfo] = deriveEncoder
}
