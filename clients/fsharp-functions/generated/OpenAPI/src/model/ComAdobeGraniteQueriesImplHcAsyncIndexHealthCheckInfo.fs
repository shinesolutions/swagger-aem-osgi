namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties

module ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo =

  //#region ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties;
  }

  //#endregion
