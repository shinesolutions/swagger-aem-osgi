namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqJcrclustersupportClusterStartLevelControllerProperties

module ComDayCqJcrclustersupportClusterStartLevelControllerInfo =

  //#region ComDayCqJcrclustersupportClusterStartLevelControllerInfo

  [<CLIMutable>]
  type ComDayCqJcrclustersupportClusterStartLevelControllerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqJcrclustersupportClusterStartLevelControllerProperties;
  }

  //#endregion
