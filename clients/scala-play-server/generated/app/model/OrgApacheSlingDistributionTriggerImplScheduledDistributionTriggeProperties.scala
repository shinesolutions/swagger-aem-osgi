package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties(
  name: Option[ConfigNodePropertyString],
  path: Option[ConfigNodePropertyString],
  seconds: Option[ConfigNodePropertyString],
  serviceName: Option[ConfigNodePropertyString]
)

object OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties {
  implicit lazy val orgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesJsonFormat: Format[OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties] = Json.format[OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties]
}

