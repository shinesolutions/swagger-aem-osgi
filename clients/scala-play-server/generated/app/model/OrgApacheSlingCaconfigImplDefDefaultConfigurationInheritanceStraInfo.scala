package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties]
)

object OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo {
  implicit lazy val orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoJsonFormat: Format[OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo] = Json.format[OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo]
}

