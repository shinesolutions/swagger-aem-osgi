package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplRenditionMakerImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplRenditionMakerImplProperties(
  xmpPropagate: Option[ConfigNodePropertyBoolean],
  xmpExcludes: Option[ConfigNodePropertyArray]
)

object ComDayCqDamCoreImplRenditionMakerImplProperties {
  implicit lazy val comDayCqDamCoreImplRenditionMakerImplPropertiesJsonFormat: Format[ComDayCqDamCoreImplRenditionMakerImplProperties] = Json.format[ComDayCqDamCoreImplRenditionMakerImplProperties]
}

