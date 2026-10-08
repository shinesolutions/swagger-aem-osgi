namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties

module ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo =

  //#region ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo

  [<CLIMutable>]
  type ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties;
  }

  //#endregion
