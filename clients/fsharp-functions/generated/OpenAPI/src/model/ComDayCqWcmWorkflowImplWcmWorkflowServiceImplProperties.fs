namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties =

  //#region ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties

  [<CLIMutable>]
  type ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties = {
    [<JsonProperty(PropertyName = "event.filter")>]
    EventFilter : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "minThreadPoolSize")>]
    MinThreadPoolSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxThreadPoolSize")>]
    MaxThreadPoolSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.wcm.workflow.terminate.on.activate")>]
    CqWcmWorkflowTerminateOnActivate : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cq.wcm.worklfow.terminate.exclusion.list")>]
    CqWcmWorklfowTerminateExclusionList : ConfigNodePropertyArray;
  }

  //#endregion
