package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties(
  jobTopics: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties {
  implicit lazy val comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesJsonFormat: Format[ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties] = Json.format[ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties]
}

