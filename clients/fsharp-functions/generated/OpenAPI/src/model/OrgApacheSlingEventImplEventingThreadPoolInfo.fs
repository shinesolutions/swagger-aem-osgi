namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingEventImplEventingThreadPoolProperties

module OrgApacheSlingEventImplEventingThreadPoolInfo =

  //#region OrgApacheSlingEventImplEventingThreadPoolInfo

  [<CLIMutable>]
  type OrgApacheSlingEventImplEventingThreadPoolInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingEventImplEventingThreadPoolProperties;
  }

  //#endregion
