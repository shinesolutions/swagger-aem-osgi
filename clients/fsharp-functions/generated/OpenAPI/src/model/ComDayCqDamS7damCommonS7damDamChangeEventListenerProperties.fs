namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties =

  //#region ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties

  [<CLIMutable>]
  type ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties = {
    [<JsonProperty(PropertyName = "cq.dam.s7dam.damchangeeventlistener.enabled")>]
    CqDamS7damDamchangeeventlistenerEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
