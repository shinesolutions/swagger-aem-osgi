package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingEventJobsQueueConfigurationProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingEventJobsQueueConfigurationProperties(
  queueName: Option[ConfigNodePropertyString],
  queueTopics: Option[ConfigNodePropertyArray],
  queueType: Option[ConfigNodePropertyDropDown],
  queuePriority: Option[ConfigNodePropertyDropDown],
  queueRetries: Option[ConfigNodePropertyInteger],
  queueRetrydelay: Option[ConfigNodePropertyInteger],
  queueMaxparallel: Option[ConfigNodePropertyFloat],
  queueKeepJobs: Option[ConfigNodePropertyBoolean],
  queuePreferRunOnCreationInstance: Option[ConfigNodePropertyBoolean],
  queueThreadPoolSize: Option[ConfigNodePropertyInteger],
  serviceRanking: Option[ConfigNodePropertyInteger]
)

object OrgApacheSlingEventJobsQueueConfigurationProperties {
  implicit lazy val orgApacheSlingEventJobsQueueConfigurationPropertiesJsonFormat: Format[OrgApacheSlingEventJobsQueueConfigurationProperties] = Json.format[OrgApacheSlingEventJobsQueueConfigurationProperties]
}

