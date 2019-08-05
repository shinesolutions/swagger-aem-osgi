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
 * @param expression 
 * @param languagePeriodextension 
 */
case class OrgApacheSlingHcCoreImplScriptableHealthCheckProperties(hcPeriodname: Option[ConfigNodePropertyString],
                hcPeriodtags: Option[ConfigNodePropertyArray],
                hcPeriodmbeanPeriodname: Option[ConfigNodePropertyString],
                expression: Option[ConfigNodePropertyString],
                languagePeriodextension: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingHcCoreImplScriptableHealthCheckProperties {
    /**
     * Creates the codec for converting OrgApacheSlingHcCoreImplScriptableHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingHcCoreImplScriptableHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingHcCoreImplScriptableHealthCheckProperties] = deriveEncoder
}
