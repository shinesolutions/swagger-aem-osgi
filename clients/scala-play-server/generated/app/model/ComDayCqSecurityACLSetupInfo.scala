package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqSecurityACLSetupInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqSecurityACLSetupInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqSecurityACLSetupProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object ComDayCqSecurityACLSetupInfo {
  implicit lazy val comDayCqSecurityACLSetupInfoJsonFormat: Format[ComDayCqSecurityACLSetupInfo] = Json.format[ComDayCqSecurityACLSetupInfo]
}

