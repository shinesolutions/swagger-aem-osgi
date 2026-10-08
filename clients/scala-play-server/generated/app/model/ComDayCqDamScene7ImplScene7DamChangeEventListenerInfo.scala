package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamScene7ImplScene7DamChangeEventListenerInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo {
  implicit lazy val comDayCqDamScene7ImplScene7DamChangeEventListenerInfoJsonFormat: Format[ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo] = Json.format[ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo]
}

