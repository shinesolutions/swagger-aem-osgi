namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteOptoutImplOptOutServiceImplProperties =

  //#region ComAdobeGraniteOptoutImplOptOutServiceImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteOptoutImplOptOutServiceImplProperties = {
    [<JsonProperty(PropertyName = "optout.cookies")>]
    OptoutCookies : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "optout.headers")>]
    OptoutHeaders : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "optout.whitelist.cookies")>]
    OptoutWhitelistCookies : ConfigNodePropertyArray;
  }

  //#endregion
