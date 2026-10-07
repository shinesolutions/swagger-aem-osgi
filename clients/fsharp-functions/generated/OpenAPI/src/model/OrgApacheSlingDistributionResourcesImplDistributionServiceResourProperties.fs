namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties =

  //#region OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties

  [<CLIMutable>]
  type OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties = {
    [<JsonProperty(PropertyName = "provider.roots")>]
    ProviderRoots : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "kind")>]
    Kind : ConfigNodePropertyString;
  }

  //#endregion
