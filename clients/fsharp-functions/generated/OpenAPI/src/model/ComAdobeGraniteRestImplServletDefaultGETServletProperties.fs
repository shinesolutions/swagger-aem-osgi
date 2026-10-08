namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteRestImplServletDefaultGETServletProperties =

  //#region ComAdobeGraniteRestImplServletDefaultGETServletProperties

  [<CLIMutable>]
  type ComAdobeGraniteRestImplServletDefaultGETServletProperties = {
    [<JsonProperty(PropertyName = "default.limit")>]
    DefaultLimit : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "use.absolute.uri")>]
    UseAbsoluteUri : ConfigNodePropertyBoolean;
  }

  //#endregion
