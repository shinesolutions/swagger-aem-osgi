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
case class OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties(name: Option[ConfigNodePropertyString],
                packageBuilderPeriodtarget: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties] = deriveEncoder
}
