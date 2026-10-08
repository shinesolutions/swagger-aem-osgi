namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties =

  //#region ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties

  [<CLIMutable>]
  type ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties = {
    [<JsonProperty(PropertyName = "oauth.token.revocation.active")>]
    OauthTokenRevocationActive : ConfigNodePropertyBoolean;
  }

  //#endregion
