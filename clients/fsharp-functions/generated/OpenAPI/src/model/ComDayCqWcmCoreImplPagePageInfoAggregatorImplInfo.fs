namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties

module ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo =

  //#region ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo

  [<CLIMutable>]
  type ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties;
  }

  //#endregion
