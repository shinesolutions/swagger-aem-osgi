namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties =

  //#region ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties

  [<CLIMutable>]
  type ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties = {
    [<JsonProperty(PropertyName = "oauth.provider.id")>]
    OauthProviderId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "oauth.cloud.config.root")>]
    OauthCloudConfigRoot : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "provider.config.root")>]
    ProviderConfigRoot : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "provider.config.create.tags.enabled")>]
    ProviderConfigCreateTagsEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "provider.config.user.folder")>]
    ProviderConfigUserFolder : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "provider.config.facebook.fetch.fields")>]
    ProviderConfigFacebookFetchFields : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "provider.config.facebook.fields")>]
    ProviderConfigFacebookFields : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "provider.config.refresh.userdata.enabled")>]
    ProviderConfigRefreshUserdataEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
