package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteThreaddumpThreadDumpCollectorProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties(
  schedulerPeriod: Option[ConfigNodePropertyInteger],
  schedulerRunOn: Option[ConfigNodePropertyDropDown],
  graniteThreaddumpEnabled: Option[ConfigNodePropertyBoolean],
  graniteThreaddumpDumpsPerFile: Option[ConfigNodePropertyInteger],
  graniteThreaddumpEnableGzipCompression: Option[ConfigNodePropertyBoolean],
  graniteThreaddumpEnableDirectoriesCompression: Option[ConfigNodePropertyBoolean],
  graniteThreaddumpEnableJStack: Option[ConfigNodePropertyBoolean],
  graniteThreaddumpMaxBackupDays: Option[ConfigNodePropertyInteger],
  graniteThreaddumpBackupCleanTrigger: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteThreaddumpThreadDumpCollectorProperties {
  implicit lazy val comAdobeGraniteThreaddumpThreadDumpCollectorPropertiesJsonFormat: Format[ComAdobeGraniteThreaddumpThreadDumpCollectorProperties] = Json.format[ComAdobeGraniteThreaddumpThreadDumpCollectorProperties]
}

