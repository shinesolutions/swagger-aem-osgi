namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties =

  //#region ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties

  [<CLIMutable>]
  type ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties = {
    [<JsonProperty(PropertyName = "delete.zip.file")>]
    DeleteZipFile : ConfigNodePropertyBoolean;
  }

  //#endregion
