package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param tenantPeriodroot 
 * @param tenantPeriodpathPeriodmatcher 
 */
case class OrgApacheSlingTenantInternalTenantProviderImplProperties(tenantPeriodroot: Option[ConfigNodePropertyString],
                tenantPeriodpathPeriodmatcher: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingTenantInternalTenantProviderImplProperties {
    /**
     * Creates the codec for converting OrgApacheSlingTenantInternalTenantProviderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingTenantInternalTenantProviderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingTenantInternalTenantProviderImplProperties] = deriveEncoder
}
