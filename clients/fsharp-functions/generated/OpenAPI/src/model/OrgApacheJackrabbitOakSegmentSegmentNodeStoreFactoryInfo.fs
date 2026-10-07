namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties

module OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo =

  //#region OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties;
  }

  //#endregion
