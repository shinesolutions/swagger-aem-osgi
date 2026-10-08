namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingEventImplJobsDefaultJobManagerProperties

module OrgApacheSlingEventImplJobsDefaultJobManagerInfo =

  //#region OrgApacheSlingEventImplJobsDefaultJobManagerInfo

  [<CLIMutable>]
  type OrgApacheSlingEventImplJobsDefaultJobManagerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingEventImplJobsDefaultJobManagerProperties;
  }

  //#endregion
