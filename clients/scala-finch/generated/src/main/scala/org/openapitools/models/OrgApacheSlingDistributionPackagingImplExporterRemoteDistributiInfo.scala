package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties]
                )

object OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo] = deriveEncoder
}
