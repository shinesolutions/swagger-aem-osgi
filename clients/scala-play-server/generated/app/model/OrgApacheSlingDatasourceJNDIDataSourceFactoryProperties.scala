package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDatasourceJNDIDataSourceFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties(
  datasourceName: Option[ConfigNodePropertyString],
  datasourceSvcPropName: Option[ConfigNodePropertyString],
  datasourceJndiName: Option[ConfigNodePropertyString],
  jndiProperties: Option[ConfigNodePropertyArray]
)

object OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties {
  implicit lazy val orgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesJsonFormat: Format[OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties] = Json.format[OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties]
}

