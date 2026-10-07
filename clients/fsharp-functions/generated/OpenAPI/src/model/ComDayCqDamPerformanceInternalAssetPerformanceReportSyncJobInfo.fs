namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties

module ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo =

  //#region ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo

  [<CLIMutable>]
  type ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties;
  }

  //#endregion
