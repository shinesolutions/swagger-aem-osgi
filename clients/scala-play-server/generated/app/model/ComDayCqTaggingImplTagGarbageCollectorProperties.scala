package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqTaggingImplTagGarbageCollectorProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqTaggingImplTagGarbageCollectorProperties(
  schedulerExpression: Option[ConfigNodePropertyString]
)

object ComDayCqTaggingImplTagGarbageCollectorProperties {
  implicit lazy val comDayCqTaggingImplTagGarbageCollectorPropertiesJsonFormat: Format[ComDayCqTaggingImplTagGarbageCollectorProperties] = Json.format[ComDayCqTaggingImplTagGarbageCollectorProperties]
}

