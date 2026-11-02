package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties(
  schedulerExpression: Option[ConfigNodePropertyString],
  jobPurgeThreshold: Option[ConfigNodePropertyInteger],
  jobPurgeMaxJobs: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties {
  implicit lazy val comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesJsonFormat: Format[ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties] = Json.format[ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties]
}

