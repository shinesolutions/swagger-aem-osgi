package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplUnzipUnzipConfigProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplUnzipUnzipConfigProperties(
  cqDamConfigUnzipMaxuncompressedsize: Option[ConfigNodePropertyInteger],
  cqDamConfigUnzipEncoding: Option[ConfigNodePropertyString]
)

object ComDayCqDamCoreImplUnzipUnzipConfigProperties {
  implicit lazy val comDayCqDamCoreImplUnzipUnzipConfigPropertiesJsonFormat: Format[ComDayCqDamCoreImplUnzipUnzipConfigProperties] = Json.format[ComDayCqDamCoreImplUnzipUnzipConfigProperties]
}

