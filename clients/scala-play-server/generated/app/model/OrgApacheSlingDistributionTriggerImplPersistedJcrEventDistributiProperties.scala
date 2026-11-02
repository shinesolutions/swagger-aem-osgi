package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties(
  name: Option[ConfigNodePropertyString],
  path: Option[ConfigNodePropertyString],
  serviceName: Option[ConfigNodePropertyString],
  nuggetsPath: Option[ConfigNodePropertyString]
)

object OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties {
  implicit lazy val orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesJsonFormat: Format[OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties] = Json.format[OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties]
}

