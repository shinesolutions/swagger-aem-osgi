namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties =

  //#region ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties

  [<CLIMutable>]
  type ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties = {
    [<JsonProperty(PropertyName = "cq.dam.scene7.damchangeeventlistener.enabled")>]
    CqDamScene7DamchangeeventlistenerEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cq.dam.scene7.damchangeeventlistener.observed.paths")>]
    CqDamScene7DamchangeeventlistenerObservedPaths : ConfigNodePropertyArray;
  }

  //#endregion
