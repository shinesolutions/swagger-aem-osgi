package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDatasourceJNDIDataSourceFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties(
  datasourceName: Option[ConfigNodePropertyString],
  datasourceSvcPropName: Option[ConfigNodePropertyString],
  datasourceJndiName: Option[ConfigNodePropertyString],
  jndiProperties: Option[ConfigNodePropertyArray]
)

object OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties {
  implicit lazy val orgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesJsonFormat: Format[OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties] = Json.format[OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties]
}

