namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties =

  //#region ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties = {
    [<JsonProperty(PropertyName = "cq.dam.detect.asset.mime.from.content")>]
    CqDamDetectAssetMimeFromContent : ConfigNodePropertyBoolean;
  }

  //#endregion
