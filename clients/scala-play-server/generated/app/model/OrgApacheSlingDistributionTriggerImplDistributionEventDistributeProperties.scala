package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties(
  name: Option[ConfigNodePropertyString],
  path: Option[ConfigNodePropertyString]
)

object OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties {
  implicit lazy val orgApacheSlingDistributionTriggerImplDistributionEventDistributePropertiesJsonFormat: Format[OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties] = Json.format[OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties]
}

