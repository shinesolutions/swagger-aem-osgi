package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo {
  implicit lazy val comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoJsonFormat: Format[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo] = Json.format[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo]
}

