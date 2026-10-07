namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplReportsReportPurgeServiceProperties =

  //#region ComDayCqDamCoreImplReportsReportPurgeServiceProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplReportsReportPurgeServiceProperties = {
    [<JsonProperty(PropertyName = "scheduler.expression")>]
    SchedulerExpression : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "maxSavedReports")>]
    MaxSavedReports : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "timeDuration")>]
    TimeDuration : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "enableReportPurge")>]
    EnableReportPurge : ConfigNodePropertyBoolean;
  }

  //#endregion
