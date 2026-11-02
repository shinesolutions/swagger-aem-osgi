package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties(
  path: Option[ConfigNodePropertyString],
  checkpathPrefix: Option[ConfigNodePropertyString],
  jcrPath: Option[ConfigNodePropertyString]
)

object OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties {
  implicit lazy val orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesJsonFormat: Format[OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties] = Json.format[OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties]
}

