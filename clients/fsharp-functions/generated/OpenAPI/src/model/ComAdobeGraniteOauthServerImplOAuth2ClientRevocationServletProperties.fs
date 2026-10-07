namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties =

  //#region ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties

  [<CLIMutable>]
  type ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties = {
    [<JsonProperty(PropertyName = "oauth.client.revocation.active")>]
    OauthClientRevocationActive : ConfigNodePropertyBoolean;
  }

  //#endregion
