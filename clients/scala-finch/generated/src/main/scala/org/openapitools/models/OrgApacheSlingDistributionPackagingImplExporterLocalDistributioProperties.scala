package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param name 
 * @param packageBuilderPeriodtarget 
 */
case class OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties(name: Option[ConfigNodePropertyString],
                packageBuilderPeriodtarget: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties] = deriveEncoder
}
