namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties

module OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo =

  //#region OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo

  [<CLIMutable>]
  type OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties;
  }

  //#endregion
