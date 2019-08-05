package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param orgPeriodapachePeriodslingPeriodscriptingPeriodcachePeriodsize 
 * @param orgPeriodapachePeriodslingPeriodscriptingPeriodcachePeriodadditionalUnderscoreextensions 
 */
case class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties(orgPeriodapachePeriodslingPeriodscriptingPeriodcachePeriodsize: Option[ConfigNodePropertyInteger],
                orgPeriodapachePeriodslingPeriodscriptingPeriodcachePeriodadditionalUnderscoreextensions: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingScriptingCoreImplScriptCacheImplProperties {
    /**
     * Creates the codec for converting OrgApacheSlingScriptingCoreImplScriptCacheImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingScriptingCoreImplScriptCacheImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingScriptingCoreImplScriptCacheImplProperties] = deriveEncoder
}
