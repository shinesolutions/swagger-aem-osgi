namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteAuthOauthImplGraniteProviderProperties

module ComAdobeGraniteAuthOauthImplGraniteProviderInfo =

  //#region ComAdobeGraniteAuthOauthImplGraniteProviderInfo

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthImplGraniteProviderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteAuthOauthImplGraniteProviderProperties;
  }

  //#endregion
