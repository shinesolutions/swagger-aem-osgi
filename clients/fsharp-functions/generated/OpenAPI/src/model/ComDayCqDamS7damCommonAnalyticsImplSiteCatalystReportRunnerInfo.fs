namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties

module ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo =

  //#region ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo

  [<CLIMutable>]
  type ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties;
  }

  //#endregion
