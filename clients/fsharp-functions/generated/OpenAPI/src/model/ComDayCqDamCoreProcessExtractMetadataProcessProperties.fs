namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreProcessExtractMetadataProcessProperties =

  //#region ComDayCqDamCoreProcessExtractMetadataProcessProperties

  [<CLIMutable>]
  type ComDayCqDamCoreProcessExtractMetadataProcessProperties = {
    [<JsonProperty(PropertyName = "process.label")>]
    ProcessLabel : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.dam.enable.sha1")>]
    CqDamEnableSha1 : ConfigNodePropertyBoolean;
  }

  //#endregion
