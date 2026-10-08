package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties]
)

object OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo {
  implicit lazy val orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoJsonFormat: Format[OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo] = Json.format[OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo]
}

