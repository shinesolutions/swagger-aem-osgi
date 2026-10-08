namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties =

  //#region ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties = {
    [<JsonProperty(PropertyName = "process.label")>]
    ProcessLabel : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "Notify on Complete")>]
    NotifyOnComplete : ConfigNodePropertyBoolean;
  }

  //#endregion
