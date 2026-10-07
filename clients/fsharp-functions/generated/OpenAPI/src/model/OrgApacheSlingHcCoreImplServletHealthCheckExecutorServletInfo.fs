namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties

module OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo =

  //#region OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo

  [<CLIMutable>]
  type OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties;
  }

  //#endregion
