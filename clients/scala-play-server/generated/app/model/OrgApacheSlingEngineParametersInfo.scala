package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingEngineParametersInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingEngineParametersInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingEngineParametersProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object OrgApacheSlingEngineParametersInfo {
  implicit lazy val orgApacheSlingEngineParametersInfoJsonFormat: Format[OrgApacheSlingEngineParametersInfo] = Json.format[OrgApacheSlingEngineParametersInfo]
}

