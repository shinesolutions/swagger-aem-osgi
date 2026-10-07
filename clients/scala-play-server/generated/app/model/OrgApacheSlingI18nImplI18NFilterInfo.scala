package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingI18nImplI18NFilterInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingI18nImplI18NFilterInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingI18nImplI18NFilterProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object OrgApacheSlingI18nImplI18NFilterInfo {
  implicit lazy val orgApacheSlingI18nImplI18NFilterInfoJsonFormat: Format[OrgApacheSlingI18nImplI18NFilterInfo] = Json.format[OrgApacheSlingI18nImplI18NFilterInfo]
}

