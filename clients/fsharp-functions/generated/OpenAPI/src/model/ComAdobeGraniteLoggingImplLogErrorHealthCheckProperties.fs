namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties =

  //#region ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
