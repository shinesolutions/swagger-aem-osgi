namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties

module ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo =

  //#region ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties;
  }

  //#endregion
