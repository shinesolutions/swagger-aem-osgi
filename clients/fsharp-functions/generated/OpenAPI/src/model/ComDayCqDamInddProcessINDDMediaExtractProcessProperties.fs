namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamInddProcessINDDMediaExtractProcessProperties =

  //#region ComDayCqDamInddProcessINDDMediaExtractProcessProperties

  [<CLIMutable>]
  type ComDayCqDamInddProcessINDDMediaExtractProcessProperties = {
    [<JsonProperty(PropertyName = "process.label")>]
    ProcessLabel : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.dam.indd.pages.regex")>]
    CqDamInddPagesRegex : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "ids.job.decoupled")>]
    IdsJobDecoupled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "ids.job.workflow.model")>]
    IdsJobWorkflowModel : ConfigNodePropertyString;
  }

  //#endregion
