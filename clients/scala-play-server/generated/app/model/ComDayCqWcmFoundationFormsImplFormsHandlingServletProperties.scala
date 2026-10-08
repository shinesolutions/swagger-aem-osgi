package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmFoundationFormsImplFormsHandlingServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties(
  nameWhitelist: Option[ConfigNodePropertyString],
  allowExpressions: Option[ConfigNodePropertyBoolean]
)

object ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties {
  implicit lazy val comDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesJsonFormat: Format[ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties] = Json.format[ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties]
}

