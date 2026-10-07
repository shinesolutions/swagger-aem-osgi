namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties =

  //#region ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties

  [<CLIMutable>]
  type ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties = {
    [<JsonProperty(PropertyName = "cq.dam.scene7.configurationeventlistener.enabled")>]
    CqDamScene7ConfigurationeventlistenerEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
