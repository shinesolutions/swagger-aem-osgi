namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties

module ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo =

  //#region ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties;
  }

  //#endregion
