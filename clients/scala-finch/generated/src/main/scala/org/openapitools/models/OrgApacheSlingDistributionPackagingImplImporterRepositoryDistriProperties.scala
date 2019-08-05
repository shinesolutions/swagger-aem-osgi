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
 * @param servicePeriodname 
 * @param path 
 * @param privilegePeriodname 
 */
case class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties(name: Option[ConfigNodePropertyString],
                servicePeriodname: Option[ConfigNodePropertyString],
                path: Option[ConfigNodePropertyString],
                privilegePeriodname: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties] = deriveEncoder
}
