package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheFelixJaasConfigurationFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheFelixJaasConfigurationFactoryProperties(
  jaasControlFlag: Option[ConfigNodePropertyDropDown],
  jaasRanking: Option[ConfigNodePropertyInteger],
  jaasRealmName: Option[ConfigNodePropertyString],
  jaasClassname: Option[ConfigNodePropertyString],
  jaasOptions: Option[ConfigNodePropertyArray]
)

object OrgApacheFelixJaasConfigurationFactoryProperties {
  implicit lazy val orgApacheFelixJaasConfigurationFactoryPropertiesJsonFormat: Format[OrgApacheFelixJaasConfigurationFactoryProperties] = Json.format[OrgApacheFelixJaasConfigurationFactoryProperties]
}

