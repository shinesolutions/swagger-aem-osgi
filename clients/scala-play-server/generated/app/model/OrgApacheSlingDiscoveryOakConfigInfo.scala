package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDiscoveryOakConfigInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDiscoveryOakConfigInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingDiscoveryOakConfigProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object OrgApacheSlingDiscoveryOakConfigInfo {
  implicit lazy val orgApacheSlingDiscoveryOakConfigInfoJsonFormat: Format[OrgApacheSlingDiscoveryOakConfigInfo] = Json.format[OrgApacheSlingDiscoveryOakConfigInfo]
}

