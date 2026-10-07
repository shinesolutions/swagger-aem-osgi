namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamCoreImplServletAssetStatusServletProperties =

  //#region ComDayCqDamCoreImplServletAssetStatusServletProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletAssetStatusServletProperties = {
    [<JsonProperty(PropertyName = "cq.dam.batch.status.maxassets")>]
    CqDamBatchStatusMaxassets : ConfigNodePropertyInteger;
  }

  //#endregion
