package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties(
  notifyOnupdate: Option[ConfigNodePropertyBoolean],
  notifyOncomplete: Option[ConfigNodePropertyBoolean]
)

object ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties {
  implicit lazy val comDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesJsonFormat: Format[ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties] = Json.format[ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties]
}

