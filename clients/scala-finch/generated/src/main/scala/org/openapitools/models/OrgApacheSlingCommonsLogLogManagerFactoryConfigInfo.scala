package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties]
                )

object OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo] = deriveEncoder
}
