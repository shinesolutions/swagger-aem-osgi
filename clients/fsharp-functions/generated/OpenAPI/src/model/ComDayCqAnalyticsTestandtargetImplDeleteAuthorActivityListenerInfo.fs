namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties

module ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo =

  //#region ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo

  [<CLIMutable>]
  type ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties;
  }

  //#endregion
