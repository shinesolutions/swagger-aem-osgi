namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplServletBatchMetadataServletProperties

module ComDayCqDamCoreImplServletBatchMetadataServletInfo =

  //#region ComDayCqDamCoreImplServletBatchMetadataServletInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletBatchMetadataServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplServletBatchMetadataServletProperties;
  }

  //#endregion
