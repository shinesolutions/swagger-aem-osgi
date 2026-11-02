package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeFormsCommonServletTempCleanUpTaskProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeFormsCommonServletTempCleanUpTaskProperties(
  schedulerExpression: Option[ConfigNodePropertyString],
  durationForTemporaryStorage: Option[ConfigNodePropertyString],
  durationForAnonymousStorage: Option[ConfigNodePropertyString]
)

object ComAdobeFormsCommonServletTempCleanUpTaskProperties {
  implicit lazy val comAdobeFormsCommonServletTempCleanUpTaskPropertiesJsonFormat: Format[ComAdobeFormsCommonServletTempCleanUpTaskProperties] = Json.format[ComAdobeFormsCommonServletTempCleanUpTaskProperties]
}

