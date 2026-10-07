namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties

module OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo =

  //#region OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo

  [<CLIMutable>]
  type OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties;
  }

  //#endregion
