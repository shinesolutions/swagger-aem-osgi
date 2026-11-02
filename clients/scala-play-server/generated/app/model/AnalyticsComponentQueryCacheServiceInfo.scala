package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for analyticsComponentQueryCacheServiceInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AnalyticsComponentQueryCacheServiceInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[AnalyticsComponentQueryCacheServiceProperties]
)

object AnalyticsComponentQueryCacheServiceInfo {
  implicit lazy val analyticsComponentQueryCacheServiceInfoJsonFormat: Format[AnalyticsComponentQueryCacheServiceInfo] = Json.format[AnalyticsComponentQueryCacheServiceInfo]
}

