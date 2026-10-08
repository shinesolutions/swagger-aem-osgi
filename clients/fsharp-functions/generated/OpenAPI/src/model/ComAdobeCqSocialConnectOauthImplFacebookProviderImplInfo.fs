namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties

module ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo =

  //#region ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo

  [<CLIMutable>]
  type ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties;
  }

  //#endregion
