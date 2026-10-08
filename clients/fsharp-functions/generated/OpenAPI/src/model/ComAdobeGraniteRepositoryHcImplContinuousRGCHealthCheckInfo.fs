namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties

module ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo =

  //#region ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties;
  }

  //#endregion
