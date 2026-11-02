package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingTracerInternalLogTracerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingTracerInternalLogTracerProperties(
  tracerSets: Option[ConfigNodePropertyArray],
  enabled: Option[ConfigNodePropertyBoolean],
  servletEnabled: Option[ConfigNodePropertyBoolean],
  recordingCacheSizeInMB: Option[ConfigNodePropertyInteger],
  recordingCacheDurationInSecs: Option[ConfigNodePropertyInteger],
  recordingCompressionEnabled: Option[ConfigNodePropertyBoolean],
  gzipResponse: Option[ConfigNodePropertyBoolean]
)

object OrgApacheSlingTracerInternalLogTracerProperties {
  implicit lazy val orgApacheSlingTracerInternalLogTracerPropertiesJsonFormat: Format[OrgApacheSlingTracerInternalLogTracerProperties] = Json.format[OrgApacheSlingTracerInternalLogTracerProperties]
}

