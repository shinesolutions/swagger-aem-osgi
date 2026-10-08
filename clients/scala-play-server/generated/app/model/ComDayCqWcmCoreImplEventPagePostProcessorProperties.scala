package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmCoreImplEventPagePostProcessorProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmCoreImplEventPagePostProcessorProperties(
  paths: Option[ConfigNodePropertyArray]
)

object ComDayCqWcmCoreImplEventPagePostProcessorProperties {
  implicit lazy val comDayCqWcmCoreImplEventPagePostProcessorPropertiesJsonFormat: Format[ComDayCqWcmCoreImplEventPagePostProcessorProperties] = Json.format[ComDayCqWcmCoreImplEventPagePostProcessorProperties]
}

