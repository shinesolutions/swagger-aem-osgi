namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties

module OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo =

  //#region OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties;
  }

  //#endregion
