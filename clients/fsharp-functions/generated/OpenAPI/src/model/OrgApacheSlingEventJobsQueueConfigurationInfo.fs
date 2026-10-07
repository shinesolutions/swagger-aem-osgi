namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingEventJobsQueueConfigurationProperties

module OrgApacheSlingEventJobsQueueConfigurationInfo =

  //#region OrgApacheSlingEventJobsQueueConfigurationInfo

  [<CLIMutable>]
  type OrgApacheSlingEventJobsQueueConfigurationInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingEventJobsQueueConfigurationProperties;
  }

  //#endregion
