namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties =

  //#region ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties

  [<CLIMutable>]
  type ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties = {
    [<JsonProperty(PropertyName = "scheduler.expression")>]
    SchedulerExpression : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "scheduler.concurrent")>]
    SchedulerConcurrent : ConfigNodePropertyBoolean;
  }

  //#endregion
