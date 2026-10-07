namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties =

  //#region ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties = {
    [<JsonProperty(PropertyName = "operation")>]
    Operation : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "operationIcon")>]
    OperationIcon : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "topicName")>]
    TopicName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "emailEnabled")>]
    EmailEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
