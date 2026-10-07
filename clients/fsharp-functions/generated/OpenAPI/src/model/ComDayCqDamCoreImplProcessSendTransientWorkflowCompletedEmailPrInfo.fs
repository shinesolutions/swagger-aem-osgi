namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties

module ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo =

  //#region ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties;
  }

  //#endregion
