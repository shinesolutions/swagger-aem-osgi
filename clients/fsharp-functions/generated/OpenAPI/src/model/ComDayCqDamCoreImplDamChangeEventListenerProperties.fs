namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqDamCoreImplDamChangeEventListenerProperties =

  //#region ComDayCqDamCoreImplDamChangeEventListenerProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplDamChangeEventListenerProperties = {
    [<JsonProperty(PropertyName = "changeeventlistener.observed.paths")>]
    ChangeeventlistenerObservedPaths : ConfigNodePropertyArray;
  }

  //#endregion
