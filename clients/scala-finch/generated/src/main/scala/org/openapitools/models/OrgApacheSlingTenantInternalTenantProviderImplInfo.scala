package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingTenantInternalTenantProviderImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingTenantInternalTenantProviderImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingTenantInternalTenantProviderImplProperties]
                )

object OrgApacheSlingTenantInternalTenantProviderImplInfo {
    /**
     * Creates the codec for converting OrgApacheSlingTenantInternalTenantProviderImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingTenantInternalTenantProviderImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingTenantInternalTenantProviderImplInfo] = deriveEncoder
}
