namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthImsProperties =

  //#region ComAdobeGraniteAuthImsProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthImsProperties = {
    [<JsonProperty(PropertyName = "configid")>]
    Configid : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "scope")>]
    Scope : ConfigNodePropertyString;
  }

  //#endregion
