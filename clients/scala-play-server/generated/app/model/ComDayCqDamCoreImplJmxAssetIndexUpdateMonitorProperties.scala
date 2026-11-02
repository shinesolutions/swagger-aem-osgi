package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties(
  jmxObjectname: Option[ConfigNodePropertyString],
  propertyMeasureEnabled: Option[ConfigNodePropertyBoolean],
  propertyName: Option[ConfigNodePropertyString],
  propertyMaxWaitMs: Option[ConfigNodePropertyInteger],
  propertyMaxRate: Option[ConfigNodePropertyFloat],
  fulltextMeasureEnabled: Option[ConfigNodePropertyBoolean],
  fulltextName: Option[ConfigNodePropertyString],
  fulltextMaxWaitMs: Option[ConfigNodePropertyInteger],
  fulltextMaxRate: Option[ConfigNodePropertyFloat]
)

object ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties {
  implicit lazy val comDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesJsonFormat: Format[ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties] = Json.format[ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties]
}

