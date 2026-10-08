namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties =

  //#region ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties

  [<CLIMutable>]
  type ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties = {
    [<JsonProperty(PropertyName = "translationFactory")>]
    TranslationFactory : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "defaultConnectorLabel")>]
    DefaultConnectorLabel : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "defaultConnectorAttribution")>]
    DefaultConnectorAttribution : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "defaultConnectorWorkspaceId")>]
    DefaultConnectorWorkspaceId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "defaultConnectorSubscriptionKey")>]
    DefaultConnectorSubscriptionKey : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "languageMapLocation")>]
    LanguageMapLocation : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "categoryMapLocation")>]
    CategoryMapLocation : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "retryAttempts")>]
    RetryAttempts : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "timeoutCount")>]
    TimeoutCount : ConfigNodePropertyInteger;
  }

  //#endregion
