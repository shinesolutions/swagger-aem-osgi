package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheFelixEventadminImplEventAdminInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheFelixEventadminImplEventAdminInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheFelixEventadminImplEventAdminProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object OrgApacheFelixEventadminImplEventAdminInfo {
  implicit lazy val orgApacheFelixEventadminImplEventAdminInfoJsonFormat: Format[OrgApacheFelixEventadminImplEventAdminInfo] = Json.format[OrgApacheFelixEventadminImplEventAdminInfo]
}

