namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties =

  //#region OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties

  [<CLIMutable>]
  type OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties = {
    [<JsonProperty(PropertyName = "max.recursion.levels")>]
    MaxRecursionLevels : ConfigNodePropertyInteger;
  }

  //#endregion
