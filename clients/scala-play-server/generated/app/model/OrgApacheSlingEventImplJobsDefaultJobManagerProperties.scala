package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingEventImplJobsDefaultJobManagerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingEventImplJobsDefaultJobManagerProperties(
  queuePriority: Option[ConfigNodePropertyDropDown],
  queueRetries: Option[ConfigNodePropertyInteger],
  queueRetrydelay: Option[ConfigNodePropertyInteger],
  queueMaxparallel: Option[ConfigNodePropertyInteger]
)

object OrgApacheSlingEventImplJobsDefaultJobManagerProperties {
  implicit lazy val orgApacheSlingEventImplJobsDefaultJobManagerPropertiesJsonFormat: Format[OrgApacheSlingEventImplJobsDefaultJobManagerProperties] = Json.format[OrgApacheSlingEventImplJobsDefaultJobManagerProperties]
}

