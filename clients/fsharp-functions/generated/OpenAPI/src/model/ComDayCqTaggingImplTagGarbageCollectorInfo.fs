namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqTaggingImplTagGarbageCollectorProperties

module ComDayCqTaggingImplTagGarbageCollectorInfo =

  //#region ComDayCqTaggingImplTagGarbageCollectorInfo

  [<CLIMutable>]
  type ComDayCqTaggingImplTagGarbageCollectorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqTaggingImplTagGarbageCollectorProperties;
  }

  //#endregion
