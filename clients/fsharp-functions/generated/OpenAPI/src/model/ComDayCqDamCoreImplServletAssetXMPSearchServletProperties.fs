namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamCoreImplServletAssetXMPSearchServletProperties =

  //#region ComDayCqDamCoreImplServletAssetXMPSearchServletProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletAssetXMPSearchServletProperties = {
    [<JsonProperty(PropertyName = "cq.dam.batch.indesign.maxassets")>]
    CqDamBatchIndesignMaxassets : ConfigNodePropertyInteger;
  }

  //#endregion
