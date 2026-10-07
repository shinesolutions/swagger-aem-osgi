package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingHapiImplHApiUtilImplInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingHapiImplHApiUtilImplInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingHapiImplHApiUtilImplProperties]
)

object OrgApacheSlingHapiImplHApiUtilImplInfo {
  implicit lazy val orgApacheSlingHapiImplHApiUtilImplInfoJsonFormat: Format[OrgApacheSlingHapiImplHApiUtilImplInfo] = Json.format[OrgApacheSlingHapiImplHApiUtilImplInfo]
}

