namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties

module ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo =

  //#region ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo

  [<CLIMutable>]
  type ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties;
  }

  //#endregion
