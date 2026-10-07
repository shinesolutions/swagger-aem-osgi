namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties

module OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo =

  //#region OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo

  [<CLIMutable>]
  type OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties;
  }

  //#endregion
