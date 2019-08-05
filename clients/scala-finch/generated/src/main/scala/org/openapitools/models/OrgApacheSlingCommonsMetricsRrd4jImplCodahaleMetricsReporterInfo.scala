package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo] = deriveEncoder
}
