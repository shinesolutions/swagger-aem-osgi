namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthOauthImplGraniteProviderProperties =

  //#region ComAdobeGraniteAuthOauthImplGraniteProviderProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthImplGraniteProviderProperties = {
    [<JsonProperty(PropertyName = "oauth.provider.id")>]
    OauthProviderId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.provider.granite.authorization.url")>]
    OauthProviderGraniteAuthorizationUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.provider.granite.token.url")>]
    OauthProviderGraniteTokenUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.provider.granite.profile.url")>]
    OauthProviderGraniteProfileUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.provider.granite.extended.details.urls")>]
    OauthProviderGraniteExtendedDetailsUrls : ConfigNodePropertyString;
  }

  //#endregion
