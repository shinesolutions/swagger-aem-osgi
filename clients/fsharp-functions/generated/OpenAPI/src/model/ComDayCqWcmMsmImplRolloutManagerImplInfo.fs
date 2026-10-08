namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmMsmImplRolloutManagerImplProperties

module ComDayCqWcmMsmImplRolloutManagerImplInfo =

  //#region ComDayCqWcmMsmImplRolloutManagerImplInfo

  [<CLIMutable>]
  type ComDayCqWcmMsmImplRolloutManagerImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmMsmImplRolloutManagerImplProperties;
    [<JsonProperty(PropertyName = "additionalProperties")>]
    AdditionalProperties : string;
    [<JsonProperty(PropertyName = "bundle_location")>]
    BundleLocation : string;
    [<JsonProperty(PropertyName = "service_location")>]
    ServiceLocation : string;
  }

  //#endregion
