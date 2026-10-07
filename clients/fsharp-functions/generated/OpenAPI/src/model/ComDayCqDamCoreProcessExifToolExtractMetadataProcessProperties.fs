namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties =

  //#region ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties

  [<CLIMutable>]
  type ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties = {
    [<JsonProperty(PropertyName = "process.label")>]
    ProcessLabel : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.dam.enable.sha1")>]
    CqDamEnableSha1 : ConfigNodePropertyBoolean;
  }

  //#endregion
