namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties =

  //#region ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties = {
    [<JsonProperty(PropertyName = "granite.workflowinbox.sort.propertyName")>]
    GraniteWorkflowinboxSortPropertyName : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "granite.workflowinbox.sort.order")>]
    GraniteWorkflowinboxSortOrder : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.workflow.job.retry")>]
    CqWorkflowJobRetry : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.workflow.superuser")>]
    CqWorkflowSuperuser : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "granite.workflow.inboxQuerySize")>]
    GraniteWorkflowInboxQuerySize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "granite.workflow.adminUserGroupFilter")>]
    GraniteWorkflowAdminUserGroupFilter : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "granite.workflow.enforceWorkitemAssigneePermissions")>]
    GraniteWorkflowEnforceWorkitemAssigneePermissions : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "granite.workflow.enforceWorkflowInitiatorPermissions")>]
    GraniteWorkflowEnforceWorkflowInitiatorPermissions : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "granite.workflow.injectTenantIdInJobTopics")>]
    GraniteWorkflowInjectTenantIdInJobTopics : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "granite.workflow.maxPurgeSaveThreshold")>]
    GraniteWorkflowMaxPurgeSaveThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "granite.workflow.maxPurgeQueryCount")>]
    GraniteWorkflowMaxPurgeQueryCount : ConfigNodePropertyInteger;
  }

  //#endregion
