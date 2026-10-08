namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplDamEventPurgeServiceProperties =

  //#region ComDayCqDamCoreImplDamEventPurgeServiceProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplDamEventPurgeServiceProperties = {
    [<JsonProperty(PropertyName = "scheduler.expression")>]
    SchedulerExpression : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "maxSavedActivities")>]
    MaxSavedActivities : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "saveInterval")>]
    SaveInterval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "enableActivityPurge")>]
    EnableActivityPurge : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "eventTypes")>]
    EventTypes : ConfigNodePropertyDropDown;
  }

  //#endregion
