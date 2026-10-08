package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties(
  hcName: Option[ConfigNodePropertyString],
  hcTags: Option[ConfigNodePropertyArray],
  hcMbeanName: Option[ConfigNodePropertyString],
  numberOfRetriesAllowed: Option[ConfigNodePropertyInteger]
)

object OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties {
  implicit lazy val orgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesJsonFormat: Format[OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties] = Json.format[OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties]
}

