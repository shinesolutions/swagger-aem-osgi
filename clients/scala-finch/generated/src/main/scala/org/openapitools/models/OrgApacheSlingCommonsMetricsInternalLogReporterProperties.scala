package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param period 
 * @param timeUnit 
 * @param level 
 * @param loggerName 
 * @param prefix 
 * @param pattern 
 * @param registryName 
 */
case class OrgApacheSlingCommonsMetricsInternalLogReporterProperties(period: Option[ConfigNodePropertyInteger],
                timeUnit: Option[ConfigNodePropertyDropDown],
                level: Option[ConfigNodePropertyDropDown],
                loggerName: Option[ConfigNodePropertyString],
                prefix: Option[ConfigNodePropertyString],
                pattern: Option[ConfigNodePropertyString],
                registryName: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingCommonsMetricsInternalLogReporterProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsMetricsInternalLogReporterProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsMetricsInternalLogReporterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsMetricsInternalLogReporterProperties] = deriveEncoder
}
