package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingI18nImplJcrResourceBundleProviderProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties(
  localeDefault: Option[ConfigNodePropertyString],
  preloadBundles: Option[ConfigNodePropertyBoolean],
  invalidationDelay: Option[ConfigNodePropertyInteger]
)

object OrgApacheSlingI18nImplJcrResourceBundleProviderProperties {
  implicit lazy val orgApacheSlingI18nImplJcrResourceBundleProviderPropertiesJsonFormat: Format[OrgApacheSlingI18nImplJcrResourceBundleProviderProperties] = Json.format[OrgApacheSlingI18nImplJcrResourceBundleProviderProperties]
}

