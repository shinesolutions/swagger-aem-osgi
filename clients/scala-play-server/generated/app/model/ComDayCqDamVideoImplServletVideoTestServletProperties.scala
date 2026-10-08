package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamVideoImplServletVideoTestServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamVideoImplServletVideoTestServletProperties(
  enabled: Option[ConfigNodePropertyBoolean]
)

object ComDayCqDamVideoImplServletVideoTestServletProperties {
  implicit lazy val comDayCqDamVideoImplServletVideoTestServletPropertiesJsonFormat: Format[ComDayCqDamVideoImplServletVideoTestServletProperties] = Json.format[ComDayCqDamVideoImplServletVideoTestServletProperties]
}

