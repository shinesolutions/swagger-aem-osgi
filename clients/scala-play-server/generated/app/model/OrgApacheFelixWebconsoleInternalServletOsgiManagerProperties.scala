package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheFelixWebconsoleInternalServletOsgiManagerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties(
  managerRoot: Option[ConfigNodePropertyString],
  httpServiceFilter: Option[ConfigNodePropertyString],
  defaultRender: Option[ConfigNodePropertyString],
  realm: Option[ConfigNodePropertyString],
  username: Option[ConfigNodePropertyString],
  password: Option[ConfigNodePropertyString],
  category: Option[ConfigNodePropertyString],
  locale: Option[ConfigNodePropertyString],
  loglevel: Option[ConfigNodePropertyDropDown],
  plugins: Option[ConfigNodePropertyDropDown]
)

object OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties {
  implicit lazy val orgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesJsonFormat: Format[OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties] = Json.format[OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties]
}

