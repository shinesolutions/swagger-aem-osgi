namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties

module ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo =

  //#region ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo

  [<CLIMutable>]
  type ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties;
  }

  //#endregion
