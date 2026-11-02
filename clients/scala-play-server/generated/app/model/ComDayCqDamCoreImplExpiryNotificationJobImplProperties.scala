package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplExpiryNotificationJobImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplExpiryNotificationJobImplProperties(
  cqDamExpiryNotificationSchedulerIstimebased: Option[ConfigNodePropertyBoolean],
  cqDamExpiryNotificationSchedulerTimebasedRule: Option[ConfigNodePropertyString],
  cqDamExpiryNotificationSchedulerPeriodRule: Option[ConfigNodePropertyInteger],
  sendEmail: Option[ConfigNodePropertyBoolean],
  assetExpiredLimit: Option[ConfigNodePropertyInteger],
  priorNotificationSeconds: Option[ConfigNodePropertyInteger],
  cqDamExpiryNotificationUrlProtocol: Option[ConfigNodePropertyString]
)

object ComDayCqDamCoreImplExpiryNotificationJobImplProperties {
  implicit lazy val comDayCqDamCoreImplExpiryNotificationJobImplPropertiesJsonFormat: Format[ComDayCqDamCoreImplExpiryNotificationJobImplProperties] = Json.format[ComDayCqDamCoreImplExpiryNotificationJobImplProperties]
}

