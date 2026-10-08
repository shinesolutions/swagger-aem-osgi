package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmNotificationImplNotificationManagerImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmNotificationImplNotificationManagerImplProperties(
  eventTopics: Option[ConfigNodePropertyArray]
)

object ComDayCqWcmNotificationImplNotificationManagerImplProperties {
  implicit lazy val comDayCqWcmNotificationImplNotificationManagerImplPropertiesJsonFormat: Format[ComDayCqWcmNotificationImplNotificationManagerImplProperties] = Json.format[ComDayCqWcmNotificationImplNotificationManagerImplProperties]
}

