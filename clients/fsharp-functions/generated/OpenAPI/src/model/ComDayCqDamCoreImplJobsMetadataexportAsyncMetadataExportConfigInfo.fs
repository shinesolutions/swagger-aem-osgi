namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties

module ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo =

  //#region ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties;
  }

  //#endregion
