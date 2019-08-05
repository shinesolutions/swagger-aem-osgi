package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties]
                )

object OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo] = deriveEncoder
}
