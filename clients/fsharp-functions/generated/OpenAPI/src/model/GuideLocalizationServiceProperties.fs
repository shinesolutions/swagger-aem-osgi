namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module GuideLocalizationServiceProperties =

  //#region GuideLocalizationServiceProperties

  [<CLIMutable>]
  type GuideLocalizationServiceProperties = {
    [<JsonProperty(PropertyName = "supportedLocales")>]
    SupportedLocales : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "Localizable Properties")>]
    LocalizableProperties : ConfigNodePropertyArray;
  }

  //#endregion
