namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingJmxProviderImplJMXResourceProviderProperties =

  //#region OrgApacheSlingJmxProviderImplJMXResourceProviderProperties

  [<CLIMutable>]
  type OrgApacheSlingJmxProviderImplJMXResourceProviderProperties = {
    [<JsonProperty(PropertyName = "provider.roots")>]
    ProviderRoots : ConfigNodePropertyString;
  }

  //#endregion
