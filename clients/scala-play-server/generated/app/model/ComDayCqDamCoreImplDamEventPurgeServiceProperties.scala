package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplDamEventPurgeServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplDamEventPurgeServiceProperties(
  schedulerExpression: Option[ConfigNodePropertyString],
  maxSavedActivities: Option[ConfigNodePropertyInteger],
  saveInterval: Option[ConfigNodePropertyInteger],
  enableActivityPurge: Option[ConfigNodePropertyBoolean],
  eventTypes: Option[ConfigNodePropertyDropDown]
)

object ComDayCqDamCoreImplDamEventPurgeServiceProperties {
  implicit lazy val comDayCqDamCoreImplDamEventPurgeServicePropertiesJsonFormat: Format[ComDayCqDamCoreImplDamEventPurgeServiceProperties] = Json.format[ComDayCqDamCoreImplDamEventPurgeServiceProperties]
}

