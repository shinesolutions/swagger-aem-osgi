package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqAnalyticsImplStorePropertiesChangeListenerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties(
  cqStoreListenerAdditionalStorePaths: Option[ConfigNodePropertyArray]
)

object ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties {
  implicit lazy val comDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesJsonFormat: Format[ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties] = Json.format[ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties]
}

