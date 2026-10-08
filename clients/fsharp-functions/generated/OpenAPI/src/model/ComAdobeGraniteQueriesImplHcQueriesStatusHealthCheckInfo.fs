namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties

module ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo =

  //#region ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties;
  }

  //#endregion
