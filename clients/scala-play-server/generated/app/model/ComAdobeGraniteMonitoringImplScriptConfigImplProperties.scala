package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteMonitoringImplScriptConfigImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteMonitoringImplScriptConfigImplProperties(
  scriptFilename: Option[ConfigNodePropertyString],
  scriptDisplay: Option[ConfigNodePropertyString],
  scriptPath: Option[ConfigNodePropertyString],
  scriptPlatform: Option[ConfigNodePropertyArray],
  interval: Option[ConfigNodePropertyInteger],
  jmxdomain: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteMonitoringImplScriptConfigImplProperties {
  implicit lazy val comAdobeGraniteMonitoringImplScriptConfigImplPropertiesJsonFormat: Format[ComAdobeGraniteMonitoringImplScriptConfigImplProperties] = Json.format[ComAdobeGraniteMonitoringImplScriptConfigImplProperties]
}

