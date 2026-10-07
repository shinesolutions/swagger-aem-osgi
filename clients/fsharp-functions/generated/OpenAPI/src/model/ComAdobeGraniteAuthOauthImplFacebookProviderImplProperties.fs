namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties =

  //#region ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties = {
    [<JsonProperty(PropertyName = "oauth.provider.id")>]
    OauthProviderId : ConfigNodePropertyString;
  }

  //#endregion
