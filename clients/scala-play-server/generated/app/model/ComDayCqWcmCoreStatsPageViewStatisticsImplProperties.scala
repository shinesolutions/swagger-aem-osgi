package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmCoreStatsPageViewStatisticsImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties(
  pageviewstatisticsTrackingurl: Option[ConfigNodePropertyString],
  pageviewstatisticsTrackingscriptEnabled: Option[ConfigNodePropertyString]
)

object ComDayCqWcmCoreStatsPageViewStatisticsImplProperties {
  implicit lazy val comDayCqWcmCoreStatsPageViewStatisticsImplPropertiesJsonFormat: Format[ComDayCqWcmCoreStatsPageViewStatisticsImplProperties] = Json.format[ComDayCqWcmCoreStatsPageViewStatisticsImplProperties]
}

