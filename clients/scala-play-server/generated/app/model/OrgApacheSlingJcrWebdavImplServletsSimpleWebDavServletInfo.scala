package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo {
  implicit lazy val orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoJsonFormat: Format[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo] = Json.format[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo]
}

