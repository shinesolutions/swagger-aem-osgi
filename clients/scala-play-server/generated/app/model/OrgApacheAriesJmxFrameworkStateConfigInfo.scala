package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheAriesJmxFrameworkStateConfigInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheAriesJmxFrameworkStateConfigInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheAriesJmxFrameworkStateConfigProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object OrgApacheAriesJmxFrameworkStateConfigInfo {
  implicit lazy val orgApacheAriesJmxFrameworkStateConfigInfoJsonFormat: Format[OrgApacheAriesJmxFrameworkStateConfigInfo] = Json.format[OrgApacheAriesJmxFrameworkStateConfigInfo]
}

