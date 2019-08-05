package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingModelsImplModelAdapterFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingModelsImplModelAdapterFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingModelsImplModelAdapterFactoryProperties]
                )

object OrgApacheSlingModelsImplModelAdapterFactoryInfo {
    /**
     * Creates the codec for converting OrgApacheSlingModelsImplModelAdapterFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingModelsImplModelAdapterFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingModelsImplModelAdapterFactoryInfo] = deriveEncoder
}
