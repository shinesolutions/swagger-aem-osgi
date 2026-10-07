namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplMissingMetadataNotificationJobProperties

module ComDayCqDamCoreImplMissingMetadataNotificationJobInfo =

  //#region ComDayCqDamCoreImplMissingMetadataNotificationJobInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplMissingMetadataNotificationJobInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplMissingMetadataNotificationJobProperties;
  }

  //#endregion
