namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties

module ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo =

  //#region ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo

  [<CLIMutable>]
  type ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties;
  }

  //#endregion
