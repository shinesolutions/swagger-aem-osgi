package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheFelixHttpInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheFelixHttpInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheFelixHttpProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object OrgApacheFelixHttpInfo {
  implicit lazy val orgApacheFelixHttpInfoJsonFormat: Format[OrgApacheFelixHttpInfo] = Json.format[OrgApacheFelixHttpInfo]
}

