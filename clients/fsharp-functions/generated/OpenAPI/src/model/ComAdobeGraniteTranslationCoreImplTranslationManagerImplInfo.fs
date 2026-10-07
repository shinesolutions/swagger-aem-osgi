namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties

module ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo =

  //#region ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo

  [<CLIMutable>]
  type ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties;
  }

  //#endregion
