package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheHttpProxyconfiguratorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheHttpProxyconfiguratorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheHttpProxyconfiguratorProperties]
                )

object OrgApacheHttpProxyconfiguratorInfo {
    /**
     * Creates the codec for converting OrgApacheHttpProxyconfiguratorInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheHttpProxyconfiguratorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheHttpProxyconfiguratorInfo] = deriveEncoder
}
