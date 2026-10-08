package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties(
  maxConnections: Option[ConfigNodePropertyString],
  maxRequests: Option[ConfigNodePropertyString],
  requestTimeout: Option[ConfigNodePropertyString],
  logDir: Option[ConfigNodePropertyString]
)

object ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties {
  implicit lazy val comAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesJsonFormat: Format[ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties] = Json.format[ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties]
}

