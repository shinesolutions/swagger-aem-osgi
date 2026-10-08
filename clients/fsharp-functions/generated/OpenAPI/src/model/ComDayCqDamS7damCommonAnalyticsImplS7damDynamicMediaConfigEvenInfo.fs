namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties

module ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo =

  //#region ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo

  [<CLIMutable>]
  type ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties;
  }

  //#endregion
