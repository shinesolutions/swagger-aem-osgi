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
 * @param slingPeriodservletPeriodmethods 
 * @param slingPeriodservletPeriodpaths 
 */
case class OrgApacheSlingAuthCoreImplLogoutServletProperties(slingPeriodservletPeriodmethods: Option[ConfigNodePropertyArray],
                slingPeriodservletPeriodpaths: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingAuthCoreImplLogoutServletProperties {
    /**
     * Creates the codec for converting OrgApacheSlingAuthCoreImplLogoutServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingAuthCoreImplLogoutServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingAuthCoreImplLogoutServletProperties] = deriveEncoder
}
