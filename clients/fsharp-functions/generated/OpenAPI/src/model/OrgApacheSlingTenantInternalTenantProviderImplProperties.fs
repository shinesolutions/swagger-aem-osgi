namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingTenantInternalTenantProviderImplProperties =

  //#region OrgApacheSlingTenantInternalTenantProviderImplProperties

  [<CLIMutable>]
  type OrgApacheSlingTenantInternalTenantProviderImplProperties = {
    [<JsonProperty(PropertyName = "tenant.root")>]
    TenantRoot : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "tenant.path.matcher")>]
    TenantPathMatcher : ConfigNodePropertyArray;
  }

  //#endregion
