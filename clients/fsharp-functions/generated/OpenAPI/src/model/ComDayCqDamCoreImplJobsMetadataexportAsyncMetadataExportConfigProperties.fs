namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties =

  //#region ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties = {
    [<JsonProperty(PropertyName = "operation")>]
    Operation : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "emailEnabled")>]
    EmailEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
