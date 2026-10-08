package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqMailerImplCqMailingServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqMailerImplCqMailingServiceProperties(
  maxRecipientCount: Option[ConfigNodePropertyString]
)

object ComDayCqMailerImplCqMailingServiceProperties {
  implicit lazy val comDayCqMailerImplCqMailingServicePropertiesJsonFormat: Format[ComDayCqMailerImplCqMailingServiceProperties] = Json.format[ComDayCqMailerImplCqMailingServiceProperties]
}

