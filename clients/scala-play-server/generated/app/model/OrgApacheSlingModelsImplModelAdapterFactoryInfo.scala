package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingModelsImplModelAdapterFactoryInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingModelsImplModelAdapterFactoryInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingModelsImplModelAdapterFactoryProperties]
)

object OrgApacheSlingModelsImplModelAdapterFactoryInfo {
  implicit lazy val orgApacheSlingModelsImplModelAdapterFactoryInfoJsonFormat: Format[OrgApacheSlingModelsImplModelAdapterFactoryInfo] = Json.format[OrgApacheSlingModelsImplModelAdapterFactoryInfo]
}

