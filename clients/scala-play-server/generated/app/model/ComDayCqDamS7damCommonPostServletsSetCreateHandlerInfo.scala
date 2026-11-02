package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties]
)

object ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo {
  implicit lazy val comDayCqDamS7damCommonPostServletsSetCreateHandlerInfoJsonFormat: Format[ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo] = Json.format[ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo]
}

