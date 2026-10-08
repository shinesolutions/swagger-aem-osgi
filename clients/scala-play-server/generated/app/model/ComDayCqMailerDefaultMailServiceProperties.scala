package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqMailerDefaultMailServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqMailerDefaultMailServiceProperties(
  smtpHost: Option[ConfigNodePropertyString],
  smtpPort: Option[ConfigNodePropertyInteger],
  smtpUser: Option[ConfigNodePropertyString],
  smtpPassword: Option[ConfigNodePropertyString],
  fromAddress: Option[ConfigNodePropertyString],
  smtpSsl: Option[ConfigNodePropertyBoolean],
  smtpStarttls: Option[ConfigNodePropertyBoolean],
  debugEmail: Option[ConfigNodePropertyBoolean]
)

object ComDayCqMailerDefaultMailServiceProperties {
  implicit lazy val comDayCqMailerDefaultMailServicePropertiesJsonFormat: Format[ComDayCqMailerDefaultMailServiceProperties] = Json.format[ComDayCqMailerDefaultMailServiceProperties]
}

