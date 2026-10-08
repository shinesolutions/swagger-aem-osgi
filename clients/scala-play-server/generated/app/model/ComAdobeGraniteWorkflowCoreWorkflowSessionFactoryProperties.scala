package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties(
  graniteWorkflowinboxSortPropertyName: Option[ConfigNodePropertyDropDown],
  graniteWorkflowinboxSortOrder: Option[ConfigNodePropertyString],
  cqWorkflowJobRetry: Option[ConfigNodePropertyInteger],
  cqWorkflowSuperuser: Option[ConfigNodePropertyArray],
  graniteWorkflowInboxQuerySize: Option[ConfigNodePropertyInteger],
  graniteWorkflowAdminUserGroupFilter: Option[ConfigNodePropertyBoolean],
  graniteWorkflowEnforceWorkitemAssigneePermissions: Option[ConfigNodePropertyBoolean],
  graniteWorkflowEnforceWorkflowInitiatorPermissions: Option[ConfigNodePropertyBoolean],
  graniteWorkflowInjectTenantIdInJobTopics: Option[ConfigNodePropertyBoolean],
  graniteWorkflowMaxPurgeSaveThreshold: Option[ConfigNodePropertyInteger],
  graniteWorkflowMaxPurgeQueryCount: Option[ConfigNodePropertyInteger]
)

object ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties {
  implicit lazy val comAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesJsonFormat: Format[ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties] = Json.format[ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties]
}

