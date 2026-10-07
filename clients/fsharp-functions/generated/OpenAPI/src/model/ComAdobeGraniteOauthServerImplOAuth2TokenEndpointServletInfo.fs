namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties

module ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo =

  //#region ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo

  [<CLIMutable>]
  type ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties;
  }

  //#endregion
