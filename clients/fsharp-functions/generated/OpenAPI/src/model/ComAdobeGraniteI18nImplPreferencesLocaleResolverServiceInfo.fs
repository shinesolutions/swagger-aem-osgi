namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties

module ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo =

  //#region ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo

  [<CLIMutable>]
  type ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties;
  }

  //#endregion
