namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties =

  //#region ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties

  [<CLIMutable>]
  type ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties = {
    [<JsonProperty(PropertyName = "workflowpackageinfoprovider.filter")>]
    WorkflowpackageinfoproviderFilter : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "workflowpackageinfoprovider.filter.rootpath")>]
    WorkflowpackageinfoproviderFilterRootpath : ConfigNodePropertyString;
  }

  //#endregion
