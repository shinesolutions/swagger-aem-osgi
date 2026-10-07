package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCommonsHttpclientProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCommonsHttpclientProperties(
  proxyEnabled: Option[ConfigNodePropertyBoolean],
  proxyHost: Option[ConfigNodePropertyString],
  proxyUser: Option[ConfigNodePropertyString],
  proxyPassword: Option[ConfigNodePropertyString],
  proxyNtlmHost: Option[ConfigNodePropertyString],
  proxyNtlmDomain: Option[ConfigNodePropertyString],
  proxyExceptions: Option[ConfigNodePropertyArray]
)

object ComDayCommonsHttpclientProperties {
  implicit lazy val comDayCommonsHttpclientPropertiesJsonFormat: Format[ComDayCommonsHttpclientProperties] = Json.format[ComDayCommonsHttpclientProperties]
}

