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
 * @param name 
 * @param endpoints 
 * @param pullPerioditems 
 * @param packageBuilderPeriodtarget 
 * @param transportSecretProviderPeriodtarget 
 */
case class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties(name: Option[ConfigNodePropertyString],
                endpoints: Option[ConfigNodePropertyArray],
                pullPerioditems: Option[ConfigNodePropertyInteger],
                packageBuilderPeriodtarget: Option[ConfigNodePropertyString],
                transportSecretProviderPeriodtarget: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties] = deriveEncoder
}
