namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties

module ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo =

  //#region ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties;
  }

  //#endregion
