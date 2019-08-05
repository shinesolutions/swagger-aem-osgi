package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties]
                )

object OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo] = deriveEncoder
}
