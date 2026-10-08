namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties

module ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo =

  //#region ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties;
  }

  //#endregion
