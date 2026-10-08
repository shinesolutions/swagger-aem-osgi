package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingHcCoreImplScriptableHealthCheckProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingHcCoreImplScriptableHealthCheckProperties(
  hcName: Option[ConfigNodePropertyString],
  hcTags: Option[ConfigNodePropertyArray],
  hcMbeanName: Option[ConfigNodePropertyString],
  expression: Option[ConfigNodePropertyString],
  languageExtension: Option[ConfigNodePropertyString]
)

object OrgApacheSlingHcCoreImplScriptableHealthCheckProperties {
  implicit lazy val orgApacheSlingHcCoreImplScriptableHealthCheckPropertiesJsonFormat: Format[OrgApacheSlingHcCoreImplScriptableHealthCheckProperties] = Json.format[OrgApacheSlingHcCoreImplScriptableHealthCheckProperties]
}

