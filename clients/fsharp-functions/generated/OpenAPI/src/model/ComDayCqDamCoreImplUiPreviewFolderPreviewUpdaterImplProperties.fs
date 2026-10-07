namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties =

  //#region ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties = {
    [<JsonProperty(PropertyName = "createPreviewEnabled")>]
    CreatePreviewEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "updatePreviewEnabled")>]
    UpdatePreviewEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "queueSize")>]
    QueueSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "folderPreviewRenditionRegex")>]
    FolderPreviewRenditionRegex : ConfigNodePropertyString;
  }

  //#endregion
