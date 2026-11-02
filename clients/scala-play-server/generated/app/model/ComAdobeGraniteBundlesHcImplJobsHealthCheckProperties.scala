package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteBundlesHcImplJobsHealthCheckProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties(
  hcTags: Option[ConfigNodePropertyArray],
  maxQueuedJobs: Option[ConfigNodePropertyInteger]
)

object ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties {
  implicit lazy val comAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesJsonFormat: Format[ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties] = Json.format[ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties]
}

