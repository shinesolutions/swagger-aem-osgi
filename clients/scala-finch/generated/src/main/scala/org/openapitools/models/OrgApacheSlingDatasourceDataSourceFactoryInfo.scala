package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDatasourceDataSourceFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDatasourceDataSourceFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDatasourceDataSourceFactoryProperties]
                )

object OrgApacheSlingDatasourceDataSourceFactoryInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDatasourceDataSourceFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDatasourceDataSourceFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDatasourceDataSourceFactoryInfo] = deriveEncoder
}
