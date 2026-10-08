namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties

module OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo =

  //#region OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo

  [<CLIMutable>]
  type OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties;
  }

  //#endregion
