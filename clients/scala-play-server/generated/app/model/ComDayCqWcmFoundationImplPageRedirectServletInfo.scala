package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmFoundationImplPageRedirectServletInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmFoundationImplPageRedirectServletInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqWcmFoundationImplPageRedirectServletProperties]
)

object ComDayCqWcmFoundationImplPageRedirectServletInfo {
  implicit lazy val comDayCqWcmFoundationImplPageRedirectServletInfoJsonFormat: Format[ComDayCqWcmFoundationImplPageRedirectServletInfo] = Json.format[ComDayCqWcmFoundationImplPageRedirectServletInfo]
}

