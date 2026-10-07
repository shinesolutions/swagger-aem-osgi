namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties

module ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo =

  //#region ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo

  [<CLIMutable>]
  type ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties;
  }

  //#endregion
