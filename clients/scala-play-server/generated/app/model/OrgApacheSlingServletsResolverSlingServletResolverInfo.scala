package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingServletsResolverSlingServletResolverInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingServletsResolverSlingServletResolverInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingServletsResolverSlingServletResolverProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object OrgApacheSlingServletsResolverSlingServletResolverInfo {
  implicit lazy val orgApacheSlingServletsResolverSlingServletResolverInfoJsonFormat: Format[OrgApacheSlingServletsResolverSlingServletResolverInfo] = Json.format[OrgApacheSlingServletsResolverSlingServletResolverInfo]
}

