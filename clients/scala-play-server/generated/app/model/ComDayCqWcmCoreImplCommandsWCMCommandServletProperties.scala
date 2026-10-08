package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmCoreImplCommandsWCMCommandServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties(
  wcmcommandservletDeleteWhitelist: Option[ConfigNodePropertyArray]
)

object ComDayCqWcmCoreImplCommandsWCMCommandServletProperties {
  implicit lazy val comDayCqWcmCoreImplCommandsWCMCommandServletPropertiesJsonFormat: Format[ComDayCqWcmCoreImplCommandsWCMCommandServletProperties] = Json.format[ComDayCqWcmCoreImplCommandsWCMCommandServletProperties]
}

