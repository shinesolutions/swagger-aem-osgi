package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties(
  archivingEnabled: Option[ConfigNodePropertyBoolean],
  schedulerExpression: Option[ConfigNodePropertyString],
  archiveSinceDaysCompleted: Option[ConfigNodePropertyInteger]
)

object ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties {
  implicit lazy val comAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesJsonFormat: Format[ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties] = Json.format[ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties]
}

