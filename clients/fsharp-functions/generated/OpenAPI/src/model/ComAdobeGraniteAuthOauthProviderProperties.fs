namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthOauthProviderProperties =

  //#region ComAdobeGraniteAuthOauthProviderProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthProviderProperties = {
    [<JsonProperty(PropertyName = "oauth.config.id")>]
    OauthConfigId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.client.id")>]
    OauthClientId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.client.secret")>]
    OauthClientSecret : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.scope")>]
    OauthScope : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "oauth.config.provider.id")>]
    OauthConfigProviderId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.create.users")>]
    OauthCreateUsers : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "oauth.userid.property")>]
    OauthUseridProperty : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "force.strict.username.matching")>]
    ForceStrictUsernameMatching : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "oauth.encode.userids")>]
    OauthEncodeUserids : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "oauth.hash.userids")>]
    OauthHashUserids : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "oauth.callBackUrl")>]
    OauthCallBackUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.access.token.persist")>]
    OauthAccessTokenPersist : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "oauth.access.token.persist.cookie")>]
    OauthAccessTokenPersistCookie : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "oauth.csrf.state.protection")>]
    OauthCsrfStateProtection : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "oauth.redirect.request.params")>]
    OauthRedirectRequestParams : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "oauth.config.siblings.allow")>]
    OauthConfigSiblingsAllow : ConfigNodePropertyBoolean;
  }

  //#endregion
