package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param orgPeriodapachePeriodslingPeriodscriptingPeriodjavascriptPeriodrhinoPeriodoptLevel 
 */
case class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties(orgPeriodapachePeriodslingPeriodscriptingPeriodjavascriptPeriodrhinoPeriodoptLevel: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties {
    /**
     * Creates the codec for converting OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties] = deriveEncoder
}
