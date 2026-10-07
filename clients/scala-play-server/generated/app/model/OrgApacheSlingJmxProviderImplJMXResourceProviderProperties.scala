package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingJmxProviderImplJMXResourceProviderProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingJmxProviderImplJMXResourceProviderProperties(
  providerRoots: Option[ConfigNodePropertyString]
)

object OrgApacheSlingJmxProviderImplJMXResourceProviderProperties {
  implicit lazy val orgApacheSlingJmxProviderImplJMXResourceProviderPropertiesJsonFormat: Format[OrgApacheSlingJmxProviderImplJMXResourceProviderProperties] = Json.format[OrgApacheSlingJmxProviderImplJMXResourceProviderProperties]
}

