package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties(
  xmpFilterApplyWhitelist: Option[ConfigNodePropertyBoolean],
  xmpFilterWhitelist: Option[ConfigNodePropertyArray],
  xmpFilterApplyBlacklist: Option[ConfigNodePropertyBoolean],
  xmpFilterBlacklist: Option[ConfigNodePropertyArray]
)

object ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties {
  implicit lazy val comDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesJsonFormat: Format[ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties] = Json.format[ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties]
}

