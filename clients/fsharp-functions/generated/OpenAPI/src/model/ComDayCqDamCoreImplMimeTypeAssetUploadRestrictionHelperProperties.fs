namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties =

  //#region ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties = {
    [<JsonProperty(PropertyName = "cq.dam.allow.all.mime")>]
    CqDamAllowAllMime : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cq.dam.allowed.asset.mimes")>]
    CqDamAllowedAssetMimes : ConfigNodePropertyArray;
  }

  //#endregion
