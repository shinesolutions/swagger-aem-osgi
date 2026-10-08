namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties =

  //#region ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties

  [<CLIMutable>]
  type ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties = {
    [<JsonProperty(PropertyName = "getPeriod")>]
    GetPeriod : ConfigNodePropertyInteger;
  }

  //#endregion
