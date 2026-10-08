namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplDamEventPurgeServiceProperties

module ComDayCqDamCoreImplDamEventPurgeServiceInfo =

  //#region ComDayCqDamCoreImplDamEventPurgeServiceInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplDamEventPurgeServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplDamEventPurgeServiceProperties;
  }

  //#endregion
