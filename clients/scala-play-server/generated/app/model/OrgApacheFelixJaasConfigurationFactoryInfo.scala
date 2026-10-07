package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheFelixJaasConfigurationFactoryInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheFelixJaasConfigurationFactoryInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheFelixJaasConfigurationFactoryProperties]
)

object OrgApacheFelixJaasConfigurationFactoryInfo {
  implicit lazy val orgApacheFelixJaasConfigurationFactoryInfoJsonFormat: Format[OrgApacheFelixJaasConfigurationFactoryInfo] = Json.format[OrgApacheFelixJaasConfigurationFactoryInfo]
}

