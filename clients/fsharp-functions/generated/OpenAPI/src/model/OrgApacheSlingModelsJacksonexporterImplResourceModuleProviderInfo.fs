namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties

module OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo =

  //#region OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo

  [<CLIMutable>]
  type OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties;
  }

  //#endregion
