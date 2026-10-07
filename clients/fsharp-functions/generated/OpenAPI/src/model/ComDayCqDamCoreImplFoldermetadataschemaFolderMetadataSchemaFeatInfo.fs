namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties

module ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo =

  //#region ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties;
  }

  //#endregion
