namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties

module ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo =

  //#region ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo

  [<CLIMutable>]
  type ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties;
  }

  //#endregion
