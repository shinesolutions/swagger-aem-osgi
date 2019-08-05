package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties]
                )

object OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo {
    /**
     * Creates the codec for converting OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo] = deriveEncoder
}
