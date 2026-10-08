namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqReportingImplCacheCacheImplProperties

module ComDayCqReportingImplCacheCacheImplInfo =

  //#region ComDayCqReportingImplCacheCacheImplInfo

  [<CLIMutable>]
  type ComDayCqReportingImplCacheCacheImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqReportingImplCacheCacheImplProperties;
  }

  //#endregion
