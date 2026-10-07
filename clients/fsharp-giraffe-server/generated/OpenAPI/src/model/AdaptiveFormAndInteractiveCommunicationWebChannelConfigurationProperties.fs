namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger

module AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties =

  //#region AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties


  type adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties = {
    ShowPlaceholder : ConfigNodePropertyBoolean;
    MaximumCacheEntries : ConfigNodePropertyInteger;
    AfScriptingCompatversion : ConfigNodePropertyDropDown;
    MakeFileNameUnique : ConfigNodePropertyBoolean;
    GeneratingCompliantData : ConfigNodePropertyBoolean;
  }
  //#endregion
