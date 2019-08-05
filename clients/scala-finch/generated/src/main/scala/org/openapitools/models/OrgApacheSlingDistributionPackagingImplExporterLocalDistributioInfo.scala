package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties]
                )

object OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo] = deriveEncoder
}
