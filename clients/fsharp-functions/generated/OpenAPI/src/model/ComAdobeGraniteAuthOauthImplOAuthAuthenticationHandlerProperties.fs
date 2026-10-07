namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties =

  //#region ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties = {
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
  }

  //#endregion
