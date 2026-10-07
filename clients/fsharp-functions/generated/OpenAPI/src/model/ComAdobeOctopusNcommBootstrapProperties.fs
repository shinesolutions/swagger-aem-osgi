namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeOctopusNcommBootstrapProperties =

  //#region ComAdobeOctopusNcommBootstrapProperties

  [<CLIMutable>]
  type ComAdobeOctopusNcommBootstrapProperties = {
    [<JsonProperty(PropertyName = "maxConnections")>]
    MaxConnections : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxRequests")>]
    MaxRequests : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "requestTimeout")>]
    RequestTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "requestRetries")>]
    RequestRetries : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "launchTimeout")>]
    LaunchTimeout : ConfigNodePropertyInteger;
  }

  //#endregion
