namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties =

  //#region ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties = {
    [<JsonProperty(PropertyName = "oauth.provider.id")>]
    OauthProviderId : ConfigNodePropertyString;
  }

  //#endregion
