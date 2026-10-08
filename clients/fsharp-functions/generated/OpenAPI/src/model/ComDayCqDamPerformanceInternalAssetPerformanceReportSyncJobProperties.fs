namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties =

  //#region ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties

  [<CLIMutable>]
  type ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties = {
    [<JsonProperty(PropertyName = "scheduler.expression")>]
    SchedulerExpression : ConfigNodePropertyString;
  }

  //#endregion
