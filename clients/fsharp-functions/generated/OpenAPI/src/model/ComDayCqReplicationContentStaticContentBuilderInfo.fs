namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqReplicationContentStaticContentBuilderProperties

module ComDayCqReplicationContentStaticContentBuilderInfo =

  //#region ComDayCqReplicationContentStaticContentBuilderInfo

  [<CLIMutable>]
  type ComDayCqReplicationContentStaticContentBuilderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqReplicationContentStaticContentBuilderProperties;
  }

  //#endregion
