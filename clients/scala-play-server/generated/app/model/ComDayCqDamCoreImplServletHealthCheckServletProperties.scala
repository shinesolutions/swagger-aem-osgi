package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplServletHealthCheckServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplServletHealthCheckServletProperties(
  cqDamSyncWorkflowId: Option[ConfigNodePropertyString],
  cqDamSyncFolderTypes: Option[ConfigNodePropertyArray]
)

object ComDayCqDamCoreImplServletHealthCheckServletProperties {
  implicit lazy val comDayCqDamCoreImplServletHealthCheckServletPropertiesJsonFormat: Format[ComDayCqDamCoreImplServletHealthCheckServletProperties] = Json.format[ComDayCqDamCoreImplServletHealthCheckServletProperties]
}

