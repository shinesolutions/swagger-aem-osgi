package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamS7damCommonServletsS7damProductInfoServletInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties]
)

object ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo {
  implicit lazy val comDayCqDamS7damCommonServletsS7damProductInfoServletInfoJsonFormat: Format[ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo] = Json.format[ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo]
}

