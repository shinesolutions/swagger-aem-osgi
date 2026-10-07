namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteAuthOauthImplGithubProviderImplProperties

module ComAdobeGraniteAuthOauthImplGithubProviderImplInfo =

  //#region ComAdobeGraniteAuthOauthImplGithubProviderImplInfo

  [<CLIMutable>]
  type ComAdobeGraniteAuthOauthImplGithubProviderImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteAuthOauthImplGithubProviderImplProperties;
  }

  //#endregion
