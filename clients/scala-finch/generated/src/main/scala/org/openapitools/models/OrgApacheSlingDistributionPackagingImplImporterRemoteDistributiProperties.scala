package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param name 
 * @param endpoints 
 * @param transportSecretProviderPeriodtarget 
 */
case class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties(name: Option[ConfigNodePropertyString],
                endpoints: Option[ConfigNodePropertyArray],
                transportSecretProviderPeriodtarget: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties] = deriveEncoder
}
