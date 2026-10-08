namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties

module ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo =

  //#region ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo

  [<CLIMutable>]
  type ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties;
  }

  //#endregion
