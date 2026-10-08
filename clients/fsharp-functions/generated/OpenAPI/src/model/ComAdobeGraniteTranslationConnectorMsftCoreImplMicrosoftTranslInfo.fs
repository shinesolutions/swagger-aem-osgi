namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties

module ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo =

  //#region ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo

  [<CLIMutable>]
  type ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties;
  }

  //#endregion
