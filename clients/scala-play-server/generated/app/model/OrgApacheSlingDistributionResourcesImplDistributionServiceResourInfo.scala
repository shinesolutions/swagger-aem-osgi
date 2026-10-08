package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingDistributionResourcesImplDistributionServiceResourInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties]
)

object OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo {
  implicit lazy val orgApacheSlingDistributionResourcesImplDistributionServiceResourInfoJsonFormat: Format[OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo] = Json.format[OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo]
}

