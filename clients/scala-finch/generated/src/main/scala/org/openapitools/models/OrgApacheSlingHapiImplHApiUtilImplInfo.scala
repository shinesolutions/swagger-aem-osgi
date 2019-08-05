package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingHapiImplHApiUtilImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingHapiImplHApiUtilImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingHapiImplHApiUtilImplProperties]
                )

object OrgApacheSlingHapiImplHApiUtilImplInfo {
    /**
     * Creates the codec for converting OrgApacheSlingHapiImplHApiUtilImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingHapiImplHApiUtilImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingHapiImplHApiUtilImplInfo] = deriveEncoder
}
