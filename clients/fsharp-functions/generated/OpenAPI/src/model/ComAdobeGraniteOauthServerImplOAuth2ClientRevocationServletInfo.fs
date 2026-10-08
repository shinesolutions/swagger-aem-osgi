namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties

module ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo =

  //#region ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo

  [<CLIMutable>]
  type ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties;
  }

  //#endregion
