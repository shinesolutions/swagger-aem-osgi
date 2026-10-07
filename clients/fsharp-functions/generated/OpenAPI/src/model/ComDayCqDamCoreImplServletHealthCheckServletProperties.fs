namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplServletHealthCheckServletProperties =

  //#region ComDayCqDamCoreImplServletHealthCheckServletProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletHealthCheckServletProperties = {
    [<JsonProperty(PropertyName = "cq.dam.sync.workflow.id")>]
    CqDamSyncWorkflowId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.dam.sync.folder.types")>]
    CqDamSyncFolderTypes : ConfigNodePropertyArray;
  }

  //#endregion
