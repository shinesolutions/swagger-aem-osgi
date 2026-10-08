namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreProcessMetadataProcessorProcessProperties =

  //#region ComDayCqDamCoreProcessMetadataProcessorProcessProperties


  type comDayCqDamCoreProcessMetadataProcessorProcessProperties = {
    ProcessLabel : ConfigNodePropertyString;
    CqDamEnableSha1 : ConfigNodePropertyBoolean;
    CqDamMetadataXssprotectedProperties : ConfigNodePropertyArray;
  }
  //#endregion
