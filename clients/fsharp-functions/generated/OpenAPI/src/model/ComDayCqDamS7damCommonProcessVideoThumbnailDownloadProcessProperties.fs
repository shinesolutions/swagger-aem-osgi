namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties =

  //#region ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties

  [<CLIMutable>]
  type ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties = {
    [<JsonProperty(PropertyName = "process.label")>]
    ProcessLabel : ConfigNodePropertyString;
  }

  //#endregion
