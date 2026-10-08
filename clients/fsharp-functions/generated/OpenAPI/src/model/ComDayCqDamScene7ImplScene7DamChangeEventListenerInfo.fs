namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties

module ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo =

  //#region ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo

  [<CLIMutable>]
  type ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties;
    [<JsonProperty(PropertyName = "bundle_location")>]
    BundleLocation : string;
    [<JsonProperty(PropertyName = "service_location")>]
    ServiceLocation : string;
  }

  //#endregion
