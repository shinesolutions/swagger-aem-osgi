package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo {
  implicit lazy val comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfoJsonFormat: Format[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo] = Json.format[ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo]
}

