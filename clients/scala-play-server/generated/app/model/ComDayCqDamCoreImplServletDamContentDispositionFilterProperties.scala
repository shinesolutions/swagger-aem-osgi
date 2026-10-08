package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplServletDamContentDispositionFilterProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties(
  cqMimeTypeBlacklist: Option[ConfigNodePropertyArray],
  cqDamEmptyMime: Option[ConfigNodePropertyBoolean]
)

object ComDayCqDamCoreImplServletDamContentDispositionFilterProperties {
  implicit lazy val comDayCqDamCoreImplServletDamContentDispositionFilterPropertiesJsonFormat: Format[ComDayCqDamCoreImplServletDamContentDispositionFilterProperties] = Json.format[ComDayCqDamCoreImplServletDamContentDispositionFilterProperties]
}

