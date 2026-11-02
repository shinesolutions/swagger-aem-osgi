package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties(
  workflowpackageinfoproviderFilter: Option[ConfigNodePropertyArray],
  workflowpackageinfoproviderFilterRootpath: Option[ConfigNodePropertyString]
)

object ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties {
  implicit lazy val comDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesJsonFormat: Format[ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties] = Json.format[ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties]
}

