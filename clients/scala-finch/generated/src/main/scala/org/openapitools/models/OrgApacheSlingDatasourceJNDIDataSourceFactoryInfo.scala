package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties]
                )

object OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo {
    /**
     * Creates the codec for converting OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo] = deriveEncoder
}
