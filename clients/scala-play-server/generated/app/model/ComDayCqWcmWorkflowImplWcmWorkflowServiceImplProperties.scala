package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties(
  eventFilter: Option[ConfigNodePropertyString],
  minThreadPoolSize: Option[ConfigNodePropertyInteger],
  maxThreadPoolSize: Option[ConfigNodePropertyInteger],
  cqWcmWorkflowTerminateOnActivate: Option[ConfigNodePropertyBoolean],
  cqWcmWorklfowTerminateExclusionList: Option[ConfigNodePropertyArray]
)

object ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties {
  implicit lazy val comDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesJsonFormat: Format[ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties] = Json.format[ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties]
}

