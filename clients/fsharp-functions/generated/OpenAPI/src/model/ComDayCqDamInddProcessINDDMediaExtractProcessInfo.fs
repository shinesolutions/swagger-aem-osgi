namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamInddProcessINDDMediaExtractProcessProperties

module ComDayCqDamInddProcessINDDMediaExtractProcessInfo =

  //#region ComDayCqDamInddProcessINDDMediaExtractProcessInfo

  [<CLIMutable>]
  type ComDayCqDamInddProcessINDDMediaExtractProcessInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamInddProcessINDDMediaExtractProcessProperties;
  }

  //#endregion
