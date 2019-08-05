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
 * @param hcPeriodname 
 * @param hcPeriodtags 
 * @param hcPeriodmbeanPeriodname 
 * @param mbeanPeriodname 
 * @param attributePeriodname 
 * @param attributePeriodvaluePeriodconstraint 
 */
case class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties(hcPeriodname: Option[ConfigNodePropertyString],
                hcPeriodtags: Option[ConfigNodePropertyArray],
                hcPeriodmbeanPeriodname: Option[ConfigNodePropertyString],
                mbeanPeriodname: Option[ConfigNodePropertyString],
                attributePeriodname: Option[ConfigNodePropertyString],
                attributePeriodvaluePeriodconstraint: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties {
    /**
     * Creates the codec for converting OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties] = deriveEncoder
}
