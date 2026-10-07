namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingJcrRepoinitRepositoryInitializerProperties

module OrgApacheSlingJcrRepoinitRepositoryInitializerInfo =

  //#region OrgApacheSlingJcrRepoinitRepositoryInitializerInfo

  [<CLIMutable>]
  type OrgApacheSlingJcrRepoinitRepositoryInitializerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingJcrRepoinitRepositoryInitializerProperties;
  }

  //#endregion
