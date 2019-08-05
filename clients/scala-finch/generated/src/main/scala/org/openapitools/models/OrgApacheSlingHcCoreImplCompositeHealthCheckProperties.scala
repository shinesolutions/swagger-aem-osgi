package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param hcPeriodname 
 * @param hcPeriodtags 
 * @param hcPeriodmbeanPeriodname 
 * @param filterPeriodtags 
 * @param filterPeriodcombineTagsWithOr 
 */
case class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties(hcPeriodname: Option[ConfigNodePropertyString],
                hcPeriodtags: Option[ConfigNodePropertyArray],
                hcPeriodmbeanPeriodname: Option[ConfigNodePropertyString],
                filterPeriodtags: Option[ConfigNodePropertyArray],
                filterPeriodcombineTagsWithOr: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingHcCoreImplCompositeHealthCheckProperties {
    /**
     * Creates the codec for converting OrgApacheSlingHcCoreImplCompositeHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingHcCoreImplCompositeHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingHcCoreImplCompositeHealthCheckProperties] = deriveEncoder
}
