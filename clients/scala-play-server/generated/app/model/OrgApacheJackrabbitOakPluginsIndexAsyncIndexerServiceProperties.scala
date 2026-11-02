package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties(
  asyncConfigs: Option[ConfigNodePropertyArray],
  leaseTimeOutMinutes: Option[ConfigNodePropertyInteger],
  failingIndexTimeoutSeconds: Option[ConfigNodePropertyInteger],
  errorWarnIntervalSeconds: Option[ConfigNodePropertyInteger]
)

object OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties {
  implicit lazy val orgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesJsonFormat: Format[OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties] = Json.format[OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties]
}

