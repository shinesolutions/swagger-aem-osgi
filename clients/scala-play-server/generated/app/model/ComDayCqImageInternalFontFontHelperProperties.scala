package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqImageInternalFontFontHelperProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqImageInternalFontFontHelperProperties(
  fontpath: Option[ConfigNodePropertyArray],
  oversamplingFactor: Option[ConfigNodePropertyInteger]
)

object ComDayCqImageInternalFontFontHelperProperties {
  implicit lazy val comDayCqImageInternalFontFontHelperPropertiesJsonFormat: Format[ComDayCqImageInternalFontFontHelperProperties] = Json.format[ComDayCqImageInternalFontFontHelperProperties]
}

