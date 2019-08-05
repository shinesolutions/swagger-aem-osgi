package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties]
                )

object OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo] = deriveEncoder
}
