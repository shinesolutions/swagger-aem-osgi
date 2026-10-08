namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamCoreImplAssetMoveListenerProperties =

  //#region ComDayCqDamCoreImplAssetMoveListenerProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplAssetMoveListenerProperties = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
  }

  //#endregion
