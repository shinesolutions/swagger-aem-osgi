package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingI18nImplI18NFilterProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingI18nImplI18NFilterProperties(
  serviceRanking: Option[ConfigNodePropertyInteger],
  slingFilterScope: Option[ConfigNodePropertyArray]
)

object OrgApacheSlingI18nImplI18NFilterProperties {
  implicit lazy val orgApacheSlingI18nImplI18NFilterPropertiesJsonFormat: Format[OrgApacheSlingI18nImplI18NFilterProperties] = Json.format[OrgApacheSlingI18nImplI18NFilterProperties]
}

