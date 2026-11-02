package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo {
  implicit lazy val orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoJsonFormat: Format[OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo] = Json.format[OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo]
}

