package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqStatisticsImplStatisticsServiceImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqStatisticsImplStatisticsServiceImplProperties(
  schedulerPeriod: Option[ConfigNodePropertyInteger],
  schedulerConcurrent: Option[ConfigNodePropertyBoolean],
  path: Option[ConfigNodePropertyString],
  workspace: Option[ConfigNodePropertyString],
  keywordsPath: Option[ConfigNodePropertyString],
  asyncEntries: Option[ConfigNodePropertyBoolean]
)

object ComDayCqStatisticsImplStatisticsServiceImplProperties {
  implicit lazy val comDayCqStatisticsImplStatisticsServiceImplPropertiesJsonFormat: Format[ComDayCqStatisticsImplStatisticsServiceImplProperties] = Json.format[ComDayCqStatisticsImplStatisticsServiceImplProperties]
}

