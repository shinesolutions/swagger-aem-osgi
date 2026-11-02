package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties(
  enabled: Option[ConfigNodePropertyBoolean],
  serviceRanking: Option[ConfigNodePropertyInteger]
)

object OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties {
  implicit lazy val orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesJsonFormat: Format[OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties] = Json.format[OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties]
}

