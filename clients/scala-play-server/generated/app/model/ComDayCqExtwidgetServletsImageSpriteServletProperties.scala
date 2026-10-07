package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqExtwidgetServletsImageSpriteServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqExtwidgetServletsImageSpriteServletProperties(
  maxWidth: Option[ConfigNodePropertyInteger],
  maxHeight: Option[ConfigNodePropertyInteger]
)

object ComDayCqExtwidgetServletsImageSpriteServletProperties {
  implicit lazy val comDayCqExtwidgetServletsImageSpriteServletPropertiesJsonFormat: Format[ComDayCqExtwidgetServletsImageSpriteServletProperties] = Json.format[ComDayCqExtwidgetServletsImageSpriteServletProperties]
}

