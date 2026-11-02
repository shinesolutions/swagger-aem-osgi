package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties(
  enabled: Option[ConfigNodePropertyBoolean],
  configPath: Option[ConfigNodePropertyString],
  fallbackPaths: Option[ConfigNodePropertyArray],
  configCollectionInheritancePropertyNames: Option[ConfigNodePropertyArray]
)

object OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties {
  implicit lazy val orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesJsonFormat: Format[OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties] = Json.format[OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties]
}

