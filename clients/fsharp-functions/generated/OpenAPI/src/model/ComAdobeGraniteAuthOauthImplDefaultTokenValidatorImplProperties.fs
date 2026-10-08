namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties =

  //#region ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties = {
    [<JsonProperty(PropertyName = "auth.token.validator.type")>]
    AuthTokenValidatorType : ConfigNodePropertyString;
  }

  //#endregion
