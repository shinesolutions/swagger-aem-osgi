package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties]
                )

object OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo] = deriveEncoder
}
