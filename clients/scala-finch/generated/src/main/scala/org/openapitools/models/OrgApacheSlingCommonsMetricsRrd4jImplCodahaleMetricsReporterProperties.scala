package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param datasources 
 * @param step 
 * @param archives 
 * @param path 
 */
case class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties(datasources: Option[ConfigNodePropertyArray],
                step: Option[ConfigNodePropertyInteger],
                archives: Option[ConfigNodePropertyArray],
                path: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties] = deriveEncoder
}
