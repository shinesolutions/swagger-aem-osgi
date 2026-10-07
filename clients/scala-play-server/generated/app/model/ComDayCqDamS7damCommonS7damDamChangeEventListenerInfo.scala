package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamS7damCommonS7damDamChangeEventListenerInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties]
)

object ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo {
  implicit lazy val comDayCqDamS7damCommonS7damDamChangeEventListenerInfoJsonFormat: Format[ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo] = Json.format[ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo]
}

