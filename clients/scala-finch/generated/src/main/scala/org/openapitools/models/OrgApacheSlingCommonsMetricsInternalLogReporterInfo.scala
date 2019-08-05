package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCommonsMetricsInternalLogReporterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingCommonsMetricsInternalLogReporterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCommonsMetricsInternalLogReporterProperties]
                )

object OrgApacheSlingCommonsMetricsInternalLogReporterInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsMetricsInternalLogReporterInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsMetricsInternalLogReporterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsMetricsInternalLogReporterInfo] = deriveEncoder
}
