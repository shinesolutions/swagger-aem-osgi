namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingHcCoreImplScriptableHealthCheckProperties

module OrgApacheSlingHcCoreImplScriptableHealthCheckInfo =

  //#region OrgApacheSlingHcCoreImplScriptableHealthCheckInfo

  [<CLIMutable>]
  type OrgApacheSlingHcCoreImplScriptableHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingHcCoreImplScriptableHealthCheckProperties;
  }

  //#endregion
