namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties

module ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo =

  //#region ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties;
  }

  //#endregion
