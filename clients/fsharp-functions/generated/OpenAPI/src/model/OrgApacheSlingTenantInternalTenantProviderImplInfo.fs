namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingTenantInternalTenantProviderImplProperties

module OrgApacheSlingTenantInternalTenantProviderImplInfo =

  //#region OrgApacheSlingTenantInternalTenantProviderImplInfo

  [<CLIMutable>]
  type OrgApacheSlingTenantInternalTenantProviderImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingTenantInternalTenantProviderImplProperties;
  }

  //#endregion
