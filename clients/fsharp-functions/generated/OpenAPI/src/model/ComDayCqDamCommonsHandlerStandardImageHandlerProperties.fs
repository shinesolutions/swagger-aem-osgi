namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamCommonsHandlerStandardImageHandlerProperties =

  //#region ComDayCqDamCommonsHandlerStandardImageHandlerProperties

  [<CLIMutable>]
  type ComDayCqDamCommonsHandlerStandardImageHandlerProperties = {
    [<JsonProperty(PropertyName = "large_file_threshold")>]
    LargeFileThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "large_comment_threshold")>]
    LargeCommentThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.enable.ext.meta.extraction")>]
    CqDamEnableExtMetaExtraction : ConfigNodePropertyBoolean;
  }

  //#endregion
