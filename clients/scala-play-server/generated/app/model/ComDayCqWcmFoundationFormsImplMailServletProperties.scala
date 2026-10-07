package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmFoundationFormsImplMailServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmFoundationFormsImplMailServletProperties(
  slingServletResourceTypes: Option[ConfigNodePropertyString],
  slingServletSelectors: Option[ConfigNodePropertyString],
  resourceWhitelist: Option[ConfigNodePropertyArray],
  resourceBlacklist: Option[ConfigNodePropertyString]
)

object ComDayCqWcmFoundationFormsImplMailServletProperties {
  implicit lazy val comDayCqWcmFoundationFormsImplMailServletPropertiesJsonFormat: Format[ComDayCqWcmFoundationFormsImplMailServletProperties] = Json.format[ComDayCqWcmFoundationFormsImplMailServletProperties]
}

