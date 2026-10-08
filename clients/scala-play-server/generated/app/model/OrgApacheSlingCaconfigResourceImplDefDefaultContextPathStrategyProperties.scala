package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties(
  enabled: Option[ConfigNodePropertyBoolean],
  configRefResourceNames: Option[ConfigNodePropertyArray],
  configRefPropertyNames: Option[ConfigNodePropertyArray],
  serviceRanking: Option[ConfigNodePropertyInteger]
)

object OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {
  implicit lazy val orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesJsonFormat: Format[OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties] = Json.format[OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties]
}

