package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodjsPeriodbindings 
 */
case class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties(orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodjsPeriodbindings: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties {
    /**
     * Creates the codec for converting OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties] = deriveEncoder
}
