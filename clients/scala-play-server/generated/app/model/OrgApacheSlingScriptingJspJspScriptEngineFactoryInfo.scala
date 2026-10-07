package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingScriptingJspJspScriptEngineFactoryInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo {
  implicit lazy val orgApacheSlingScriptingJspJspScriptEngineFactoryInfoJsonFormat: Format[OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo] = Json.format[OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo]
}

