namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamCoreImplHandlerJpegHandlerProperties =

  //#region ComDayCqDamCoreImplHandlerJpegHandlerProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplHandlerJpegHandlerProperties = {
    [<JsonProperty(PropertyName = "cq.dam.enable.ext.meta.extraction")>]
    CqDamEnableExtMetaExtraction : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "large_file_threshold")>]
    LargeFileThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "large_comment_threshold")>]
    LargeCommentThreshold : ConfigNodePropertyInteger;
  }

  //#endregion
