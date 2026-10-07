package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties(
  effectiveBundleListPath: Option[ConfigNodePropertyString]
)

object ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties {
  implicit lazy val comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesJsonFormat: Format[ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties] = Json.format[ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties]
}

