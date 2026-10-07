namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties =

  //#region ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties = {
    [<JsonProperty(PropertyName = "oauth.cookie.login.timeout")>]
    OauthCookieLoginTimeout : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.cookie.max.age")>]
    OauthCookieMaxAge : ConfigNodePropertyString;
  }

  //#endregion
