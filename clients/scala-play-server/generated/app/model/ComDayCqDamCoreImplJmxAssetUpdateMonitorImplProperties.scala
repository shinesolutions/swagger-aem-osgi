package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties(
  jmxObjectname: Option[ConfigNodePropertyString],
  active: Option[ConfigNodePropertyBoolean]
)

object ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties {
  implicit lazy val comDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesJsonFormat: Format[ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties] = Json.format[ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties]
}

