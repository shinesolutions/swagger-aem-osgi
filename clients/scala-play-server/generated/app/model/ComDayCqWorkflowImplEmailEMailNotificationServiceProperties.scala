package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWorkflowImplEmailEMailNotificationServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties(
  fromAddress: Option[ConfigNodePropertyString],
  hostPrefix: Option[ConfigNodePropertyString],
  notifyOnabort: Option[ConfigNodePropertyBoolean],
  notifyOncomplete: Option[ConfigNodePropertyBoolean],
  notifyOncontainercomplete: Option[ConfigNodePropertyBoolean],
  notifyUseronly: Option[ConfigNodePropertyBoolean]
)

object ComDayCqWorkflowImplEmailEMailNotificationServiceProperties {
  implicit lazy val comDayCqWorkflowImplEmailEMailNotificationServicePropertiesJsonFormat: Format[ComDayCqWorkflowImplEmailEMailNotificationServiceProperties] = Json.format[ComDayCqWorkflowImplEmailEMailNotificationServiceProperties]
}

