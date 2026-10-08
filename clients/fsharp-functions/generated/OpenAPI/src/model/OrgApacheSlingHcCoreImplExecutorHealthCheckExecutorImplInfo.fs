namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties

module OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo =

  //#region OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo

  [<CLIMutable>]
  type OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties;
  }

  //#endregion
