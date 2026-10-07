namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties =

  //#region ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties


  type comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties = {
    TranslationFactory : ConfigNodePropertyString;
    DefaultConnectorLabel : ConfigNodePropertyString;
    DefaultConnectorAttribution : ConfigNodePropertyString;
    DefaultConnectorWorkspaceId : ConfigNodePropertyString;
    DefaultConnectorSubscriptionKey : ConfigNodePropertyString;
    LanguageMapLocation : ConfigNodePropertyString;
    CategoryMapLocation : ConfigNodePropertyString;
    RetryAttempts : ConfigNodePropertyInteger;
    TimeoutCount : ConfigNodePropertyInteger;
  }
  //#endregion
