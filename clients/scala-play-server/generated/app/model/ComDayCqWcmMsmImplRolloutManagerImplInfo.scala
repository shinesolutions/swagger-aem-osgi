package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmMsmImplRolloutManagerImplInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmMsmImplRolloutManagerImplInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqWcmMsmImplRolloutManagerImplProperties],
  additionalProperties: Option[String],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object ComDayCqWcmMsmImplRolloutManagerImplInfo {
  implicit lazy val comDayCqWcmMsmImplRolloutManagerImplInfoJsonFormat: Format[ComDayCqWcmMsmImplRolloutManagerImplInfo] = Json.format[ComDayCqWcmMsmImplRolloutManagerImplInfo]
}

