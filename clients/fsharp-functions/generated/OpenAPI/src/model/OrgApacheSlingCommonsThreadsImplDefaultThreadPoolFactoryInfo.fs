namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties

module OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo =

  //#region OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo

  [<CLIMutable>]
  type OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties;
  }

  //#endregion
