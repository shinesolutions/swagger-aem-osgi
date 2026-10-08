namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties =

  //#region OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties = {
    [<JsonProperty(PropertyName = "commitsTrackerWriterGroups")>]
    CommitsTrackerWriterGroups : ConfigNodePropertyArray;
  }

  //#endregion
