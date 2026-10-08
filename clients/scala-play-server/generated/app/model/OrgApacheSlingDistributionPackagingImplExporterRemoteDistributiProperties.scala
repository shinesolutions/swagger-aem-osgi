package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties(
  name: Option[ConfigNodePropertyString],
  endpoints: Option[ConfigNodePropertyArray],
  pullItems: Option[ConfigNodePropertyInteger],
  packageBuilderTarget: Option[ConfigNodePropertyString],
  transportSecretProviderTarget: Option[ConfigNodePropertyString]
)

object OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties {
  implicit lazy val orgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesJsonFormat: Format[OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties] = Json.format[OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties]
}

