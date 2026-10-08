package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties(
  enabled: Option[ConfigNodePropertyBoolean]
)

object OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties {
  implicit lazy val orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesJsonFormat: Format[OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties] = Json.format[OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties]
}

