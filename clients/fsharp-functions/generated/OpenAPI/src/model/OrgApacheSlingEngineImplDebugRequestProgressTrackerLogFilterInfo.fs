namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties

module OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo =

  //#region OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo

  [<CLIMutable>]
  type OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties;
  }

  //#endregion
