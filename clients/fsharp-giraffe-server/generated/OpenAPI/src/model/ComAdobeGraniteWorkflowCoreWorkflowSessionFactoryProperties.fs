namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties =

  //#region ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties


  type comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties = {
    GraniteWorkflowinboxSortPropertyName : ConfigNodePropertyDropDown;
    GraniteWorkflowinboxSortOrder : ConfigNodePropertyString;
    CqWorkflowJobRetry : ConfigNodePropertyInteger;
    CqWorkflowSuperuser : ConfigNodePropertyArray;
    GraniteWorkflowInboxQuerySize : ConfigNodePropertyInteger;
    GraniteWorkflowAdminUserGroupFilter : ConfigNodePropertyBoolean;
    GraniteWorkflowEnforceWorkitemAssigneePermissions : ConfigNodePropertyBoolean;
    GraniteWorkflowEnforceWorkflowInitiatorPermissions : ConfigNodePropertyBoolean;
    GraniteWorkflowInjectTenantIdInJobTopics : ConfigNodePropertyBoolean;
    GraniteWorkflowMaxPurgeSaveThreshold : ConfigNodePropertyInteger;
    GraniteWorkflowMaxPurgeQueryCount : ConfigNodePropertyInteger;
  }
  //#endregion
