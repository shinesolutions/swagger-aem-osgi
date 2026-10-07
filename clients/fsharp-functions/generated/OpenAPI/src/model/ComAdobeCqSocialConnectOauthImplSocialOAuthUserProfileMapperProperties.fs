namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties =

  //#region ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties

  [<CLIMutable>]
  type ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties = {
    [<JsonProperty(PropertyName = "facebook")>]
    Facebook : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "twitter")>]
    Twitter : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "provider.config.user.folder")>]
    ProviderConfigUserFolder : ConfigNodePropertyString;
  }

  //#endregion
