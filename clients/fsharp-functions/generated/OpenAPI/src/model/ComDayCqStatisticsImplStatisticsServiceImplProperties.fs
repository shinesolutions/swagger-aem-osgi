namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqStatisticsImplStatisticsServiceImplProperties =

  //#region ComDayCqStatisticsImplStatisticsServiceImplProperties

  [<CLIMutable>]
  type ComDayCqStatisticsImplStatisticsServiceImplProperties = {
    [<JsonProperty(PropertyName = "scheduler.period")>]
    SchedulerPeriod : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "scheduler.concurrent")>]
    SchedulerConcurrent : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "workspace")>]
    Workspace : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "keywordsPath")>]
    KeywordsPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "asyncEntries")>]
    AsyncEntries : ConfigNodePropertyBoolean;
  }

  //#endregion
