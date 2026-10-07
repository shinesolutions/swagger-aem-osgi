namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties

module ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo =

  //#region ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo

  [<CLIMutable>]
  type ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties;
  }

  //#endregion
