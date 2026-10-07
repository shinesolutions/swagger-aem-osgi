package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties(
  jobConsumermanagerDisableDistribution: Option[ConfigNodePropertyBoolean],
  startupDelay: Option[ConfigNodePropertyInteger],
  cleanupPeriod: Option[ConfigNodePropertyInteger]
)

object OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties {
  implicit lazy val orgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesJsonFormat: Format[OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties] = Json.format[OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties]
}

