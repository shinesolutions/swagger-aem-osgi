namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqPollingImporterImplPollingImporterImplProperties =

  //#region ComDayCqPollingImporterImplPollingImporterImplProperties

  [<CLIMutable>]
  type ComDayCqPollingImporterImplPollingImporterImplProperties = {
    [<JsonProperty(PropertyName = "importer.min.interval")>]
    ImporterMinInterval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "importer.user")>]
    ImporterUser : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "exclude.paths")>]
    ExcludePaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "include.paths")>]
    IncludePaths : ConfigNodePropertyArray;
  }

  //#endregion
