namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteCompatrouterImplRoutingConfigProperties =

  //#region ComAdobeGraniteCompatrouterImplRoutingConfigProperties

  [<CLIMutable>]
  type ComAdobeGraniteCompatrouterImplRoutingConfigProperties = {
    [<JsonProperty(PropertyName = "id")>]
    Id : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "compatPath")>]
    CompatPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "newPath")>]
    NewPath : ConfigNodePropertyString;
  }

  //#endregion
