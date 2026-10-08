namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties =

  //#region ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties = {
    [<JsonProperty(PropertyName = "granite:data")>]
    GraniteData : ConfigNodePropertyArray;
  }

  //#endregion
