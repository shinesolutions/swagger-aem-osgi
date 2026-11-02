package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingI18nImplJcrResourceBundleProviderInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingI18nImplJcrResourceBundleProviderInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[OrgApacheSlingI18nImplJcrResourceBundleProviderProperties],
  additionalProperties: Option[String],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object OrgApacheSlingI18nImplJcrResourceBundleProviderInfo {
  implicit lazy val orgApacheSlingI18nImplJcrResourceBundleProviderInfoJsonFormat: Format[OrgApacheSlingI18nImplJcrResourceBundleProviderInfo] = Json.format[OrgApacheSlingI18nImplJcrResourceBundleProviderInfo]
}

