namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamCoreImplServletAssetDownloadServletProperties =

  //#region ComDayCqDamCoreImplServletAssetDownloadServletProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletAssetDownloadServletProperties = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
  }

  //#endregion
