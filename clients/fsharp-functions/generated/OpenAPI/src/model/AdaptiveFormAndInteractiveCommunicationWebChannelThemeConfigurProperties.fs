namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties =

  //#region AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties

  [<CLIMutable>]
  type AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties = {
    [<JsonProperty(PropertyName = "fontList")>]
    FontList : ConfigNodePropertyArray;
  }

  //#endregion
