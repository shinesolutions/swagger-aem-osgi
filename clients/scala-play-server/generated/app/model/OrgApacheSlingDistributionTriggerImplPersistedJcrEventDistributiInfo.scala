package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties]
)

object OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo {
  implicit lazy val orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoJsonFormat: Format[OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo] = Json.format[OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo]
}

