namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties =

  //#region OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties = {
    [<JsonProperty(PropertyName = "provider.roots")>]
    ProviderRoots : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "kind")>]
    Kind : ConfigNodePropertyString;
  }

  //#endregion
