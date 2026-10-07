namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties

module ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo =

  //#region ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties;
  }

  //#endregion
