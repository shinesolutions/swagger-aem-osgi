namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger

module AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties =

  //#region AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties

  [<CLIMutable>]
  type AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties = {
    [<JsonProperty(PropertyName = "showPlaceholder")>]
    ShowPlaceholder : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "maximumCacheEntries")>]
    MaximumCacheEntries : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "af.scripting.compatversion")>]
    AfScriptingCompatversion : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "makeFileNameUnique")>]
    MakeFileNameUnique : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "generatingCompliantData")>]
    GeneratingCompliantData : ConfigNodePropertyBoolean;
  }

  //#endregion
