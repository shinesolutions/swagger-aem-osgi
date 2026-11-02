package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties(
  cqAnalyticsTestandtargetApiUrl: Option[ConfigNodePropertyString],
  cqAnalyticsTestandtargetTimeout: Option[ConfigNodePropertyInteger],
  cqAnalyticsTestandtargetSockettimeout: Option[ConfigNodePropertyInteger],
  cqAnalyticsTestandtargetRecommendationsUrlReplace: Option[ConfigNodePropertyString],
  cqAnalyticsTestandtargetRecommendationsUrlReplacewith: Option[ConfigNodePropertyString]
)

object ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties {
  implicit lazy val comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesJsonFormat: Format[ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties] = Json.format[ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties]
}

