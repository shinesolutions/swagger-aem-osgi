package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo {
  implicit lazy val orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoJsonFormat: Format[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo] = Json.format[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo]
}

