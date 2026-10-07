namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreProcessMetadataProcessorProcessProperties =

  //#region ComDayCqDamCoreProcessMetadataProcessorProcessProperties

  [<CLIMutable>]
  type ComDayCqDamCoreProcessMetadataProcessorProcessProperties = {
    [<JsonProperty(PropertyName = "process.label")>]
    ProcessLabel : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.dam.enable.sha1")>]
    CqDamEnableSha1 : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cq.dam.metadata.xssprotected.properties")>]
    CqDamMetadataXssprotectedProperties : ConfigNodePropertyArray;
  }

  //#endregion
