namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplDamEventRecorderImplProperties =

  //#region ComDayCqDamCoreImplDamEventRecorderImplProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplDamEventRecorderImplProperties = {
    [<JsonProperty(PropertyName = "event.filter")>]
    EventFilter : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "event.queue.length")>]
    EventQueueLength : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "eventrecorder.enabled")>]
    EventrecorderEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "eventrecorder.blacklist")>]
    EventrecorderBlacklist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "eventrecorder.eventtypes")>]
    EventrecorderEventtypes : ConfigNodePropertyDropDown;
  }

  //#endregion
