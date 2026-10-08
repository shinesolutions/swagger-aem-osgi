namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties

module ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo =

  //#region ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo

  [<CLIMutable>]
  type ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties;
    [<JsonProperty(PropertyName = "bundle_location")>]
    BundleLocation : string;
    [<JsonProperty(PropertyName = "service_location")>]
    ServiceLocation : string;
  }

  //#endregion
