package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheFelixJaasConfigurationSpiProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheFelixJaasConfigurationSpiProperties(
  jaasDefaultRealmName: Option[ConfigNodePropertyString],
  jaasConfigProviderName: Option[ConfigNodePropertyString],
  jaasGlobalConfigPolicy: Option[ConfigNodePropertyDropDown]
)

object OrgApacheFelixJaasConfigurationSpiProperties {
  implicit lazy val orgApacheFelixJaasConfigurationSpiPropertiesJsonFormat: Format[OrgApacheFelixJaasConfigurationSpiProperties] = Json.format[OrgApacheFelixJaasConfigurationSpiProperties]
}

