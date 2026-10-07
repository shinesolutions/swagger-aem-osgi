package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties(
  pathDescField: Option[ConfigNodePropertyString],
  pathChildField: Option[ConfigNodePropertyString],
  pathParentField: Option[ConfigNodePropertyString],
  pathExactField: Option[ConfigNodePropertyString],
  catchAllField: Option[ConfigNodePropertyString],
  collapsedPathField: Option[ConfigNodePropertyString],
  pathDepthField: Option[ConfigNodePropertyString],
  commitPolicy: Option[ConfigNodePropertyDropDown],
  rows: Option[ConfigNodePropertyInteger],
  pathRestrictions: Option[ConfigNodePropertyBoolean],
  propertyRestrictions: Option[ConfigNodePropertyBoolean],
  primarytypesRestrictions: Option[ConfigNodePropertyBoolean],
  ignoredProperties: Option[ConfigNodePropertyArray],
  usedProperties: Option[ConfigNodePropertyArray],
  typeMappings: Option[ConfigNodePropertyArray],
  propertyMappings: Option[ConfigNodePropertyArray],
  collapseJcrcontentNodes: Option[ConfigNodePropertyBoolean]
)

object OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties {
  implicit lazy val orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesJsonFormat: Format[OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties] = Json.format[OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties]
}

