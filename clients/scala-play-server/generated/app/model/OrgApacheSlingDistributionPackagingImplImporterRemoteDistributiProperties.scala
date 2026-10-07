package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties(
  name: Option[ConfigNodePropertyString],
  endpoints: Option[ConfigNodePropertyArray],
  transportSecretProviderTarget: Option[ConfigNodePropertyString]
)

object OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties {
  implicit lazy val orgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesJsonFormat: Format[OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties] = Json.format[OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties]
}

