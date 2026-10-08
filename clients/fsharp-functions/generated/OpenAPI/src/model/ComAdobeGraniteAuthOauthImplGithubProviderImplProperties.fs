namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthOauthImplGithubProviderImplProperties =

  //#region ComAdobeGraniteAuthOauthImplGithubProviderImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthImplGithubProviderImplProperties = {
    [<JsonProperty(PropertyName = "oauth.provider.id")>]
    OauthProviderId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.provider.github.authorization.url")>]
    OauthProviderGithubAuthorizationUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.provider.github.token.url")>]
    OauthProviderGithubTokenUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.provider.github.profile.url")>]
    OauthProviderGithubProfileUrl : ConfigNodePropertyString;
  }

  //#endregion
