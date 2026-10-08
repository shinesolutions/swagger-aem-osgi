namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties

module ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo =

  //#region ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo

  [<CLIMutable>]
  type ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties;
  }

  //#endregion
