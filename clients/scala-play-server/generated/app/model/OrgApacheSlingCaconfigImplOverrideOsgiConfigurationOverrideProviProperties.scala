package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties(
  description: Option[ConfigNodePropertyString],
  overrides: Option[ConfigNodePropertyArray],
  enabled: Option[ConfigNodePropertyBoolean],
  serviceRanking: Option[ConfigNodePropertyInteger]
)

object OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties {
  implicit lazy val orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesJsonFormat: Format[OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties] = Json.format[OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties]
}

