package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties(
  hcTags: Option[ConfigNodePropertyArray],
  ignoredBundles: Option[ConfigNodePropertyArray]
)

object ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties {
  implicit lazy val comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesJsonFormat: Format[ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties] = Json.format[ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties]
}

