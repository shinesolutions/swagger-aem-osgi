package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties(
  name: Option[ConfigNodePropertyString],
  path: Option[ConfigNodePropertyString],
  ignoredPathsPatterns: Option[ConfigNodePropertyArray],
  serviceName: Option[ConfigNodePropertyString],
  deep: Option[ConfigNodePropertyBoolean]
)

object OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties {
  implicit lazy val orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesJsonFormat: Format[OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties] = Json.format[OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties]
}

