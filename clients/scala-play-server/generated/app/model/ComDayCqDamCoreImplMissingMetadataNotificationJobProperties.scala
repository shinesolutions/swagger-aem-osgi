package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplMissingMetadataNotificationJobProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties(
  cqDamMissingmetadataNotificationSchedulerIstimebased: Option[ConfigNodePropertyBoolean],
  cqDamMissingmetadataNotificationSchedulerTimebasedRule: Option[ConfigNodePropertyString],
  cqDamMissingmetadataNotificationSchedulerPeriodRule: Option[ConfigNodePropertyInteger],
  cqDamMissingmetadataNotificationRecipient: Option[ConfigNodePropertyString]
)

object ComDayCqDamCoreImplMissingMetadataNotificationJobProperties {
  implicit lazy val comDayCqDamCoreImplMissingMetadataNotificationJobPropertiesJsonFormat: Format[ComDayCqDamCoreImplMissingMetadataNotificationJobProperties] = Json.format[ComDayCqDamCoreImplMissingMetadataNotificationJobProperties]
}

