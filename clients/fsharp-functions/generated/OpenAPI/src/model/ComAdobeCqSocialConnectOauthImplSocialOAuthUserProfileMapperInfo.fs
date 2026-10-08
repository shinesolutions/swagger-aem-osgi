namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties

module ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo =

  //#region ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo

  [<CLIMutable>]
  type ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties;
  }

  //#endregion
