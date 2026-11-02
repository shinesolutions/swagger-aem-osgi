package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties(
  solrHttpUrl: Option[ConfigNodePropertyString],
  solrZkHost: Option[ConfigNodePropertyString],
  solrCollection: Option[ConfigNodePropertyString],
  solrSocketTimeout: Option[ConfigNodePropertyInteger],
  solrConnectionTimeout: Option[ConfigNodePropertyInteger],
  solrShardsNo: Option[ConfigNodePropertyInteger],
  solrReplicationFactor: Option[ConfigNodePropertyInteger],
  solrConfDir: Option[ConfigNodePropertyString]
)

object OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties {
  implicit lazy val orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesJsonFormat: Format[OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties] = Json.format[OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties]
}

