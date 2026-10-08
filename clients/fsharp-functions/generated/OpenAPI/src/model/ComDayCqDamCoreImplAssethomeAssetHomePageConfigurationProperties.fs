namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties =

  //#region ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties = {
    [<JsonProperty(PropertyName = "isEnabled")>]
    IsEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
