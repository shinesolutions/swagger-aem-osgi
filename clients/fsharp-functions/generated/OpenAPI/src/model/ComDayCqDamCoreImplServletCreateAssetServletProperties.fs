namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamCoreImplServletCreateAssetServletProperties =

  //#region ComDayCqDamCoreImplServletCreateAssetServletProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletCreateAssetServletProperties = {
    [<JsonProperty(PropertyName = "detect_duplicate")>]
    DetectDuplicate : ConfigNodePropertyBoolean;
  }

  //#endregion
