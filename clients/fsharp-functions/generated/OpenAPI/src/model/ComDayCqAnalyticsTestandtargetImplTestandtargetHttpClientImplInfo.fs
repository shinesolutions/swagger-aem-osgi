namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties

module ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo =

  //#region ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo

  [<CLIMutable>]
  type ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties;
  }

  //#endregion
