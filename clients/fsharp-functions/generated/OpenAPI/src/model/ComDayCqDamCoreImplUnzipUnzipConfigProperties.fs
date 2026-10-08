namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplUnzipUnzipConfigProperties =

  //#region ComDayCqDamCoreImplUnzipUnzipConfigProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplUnzipUnzipConfigProperties = {
    [<JsonProperty(PropertyName = "cq.dam.config.unzip.maxuncompressedsize")>]
    CqDamConfigUnzipMaxuncompressedsize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.config.unzip.encoding")>]
    CqDamConfigUnzipEncoding : ConfigNodePropertyString;
  }

  //#endregion
