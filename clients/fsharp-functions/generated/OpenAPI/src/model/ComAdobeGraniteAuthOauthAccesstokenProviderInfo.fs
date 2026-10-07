namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteAuthOauthAccesstokenProviderProperties

module ComAdobeGraniteAuthOauthAccesstokenProviderInfo =

  //#region ComAdobeGraniteAuthOauthAccesstokenProviderInfo

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthAccesstokenProviderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteAuthOauthAccesstokenProviderProperties;
  }

  //#endregion
