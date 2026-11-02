package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheHttpProxyconfiguratorProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheHttpProxyconfiguratorProperties(
  proxyEnabled: Option[ConfigNodePropertyBoolean],
  proxyHost: Option[ConfigNodePropertyString],
  proxyPort: Option[ConfigNodePropertyInteger],
  proxyUser: Option[ConfigNodePropertyString],
  proxyPassword: Option[ConfigNodePropertyString],
  proxyExceptions: Option[ConfigNodePropertyArray]
)

object OrgApacheHttpProxyconfiguratorProperties {
  implicit lazy val orgApacheHttpProxyconfiguratorPropertiesJsonFormat: Format[OrgApacheHttpProxyconfiguratorProperties] = Json.format[OrgApacheHttpProxyconfiguratorProperties]
}

