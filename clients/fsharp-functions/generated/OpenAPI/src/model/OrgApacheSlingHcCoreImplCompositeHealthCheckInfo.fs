namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingHcCoreImplCompositeHealthCheckProperties

module OrgApacheSlingHcCoreImplCompositeHealthCheckInfo =

  //#region OrgApacheSlingHcCoreImplCompositeHealthCheckInfo

  [<CLIMutable>]
  type OrgApacheSlingHcCoreImplCompositeHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingHcCoreImplCompositeHealthCheckProperties;
  }

  //#endregion
