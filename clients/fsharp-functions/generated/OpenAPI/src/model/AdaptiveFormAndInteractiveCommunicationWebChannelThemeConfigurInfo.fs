namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties

module AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo =

  //#region AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo

  [<CLIMutable>]
  type AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties;
  }

  //#endregion
