namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteAuthOauthProviderProperties

module ComAdobeGraniteAuthOauthProviderInfo =

  //#region ComAdobeGraniteAuthOauthProviderInfo

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthProviderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteAuthOauthProviderProperties;
  }

  //#endregion
