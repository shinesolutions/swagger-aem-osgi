package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplDamChangeEventListenerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplDamChangeEventListenerProperties(
  changeeventlistenerObservedPaths: Option[ConfigNodePropertyArray]
)

object ComDayCqDamCoreImplDamChangeEventListenerProperties {
  implicit lazy val comDayCqDamCoreImplDamChangeEventListenerPropertiesJsonFormat: Format[ComDayCqDamCoreImplDamChangeEventListenerProperties] = Json.format[ComDayCqDamCoreImplDamChangeEventListenerProperties]
}

