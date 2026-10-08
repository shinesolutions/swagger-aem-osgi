package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheFelixWebconsolePluginsEventInternalPluginServletInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties]
)

object OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo {
  implicit lazy val orgApacheFelixWebconsolePluginsEventInternalPluginServletInfoJsonFormat: Format[OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo] = Json.format[OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo]
}

