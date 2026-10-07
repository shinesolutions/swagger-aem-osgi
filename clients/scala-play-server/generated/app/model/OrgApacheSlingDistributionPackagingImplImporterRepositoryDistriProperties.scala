package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties(
  name: Option[ConfigNodePropertyString],
  serviceName: Option[ConfigNodePropertyString],
  path: Option[ConfigNodePropertyString],
  privilegeName: Option[ConfigNodePropertyString]
)

object OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties {
  implicit lazy val orgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesJsonFormat: Format[OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties] = Json.format[OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties]
}

