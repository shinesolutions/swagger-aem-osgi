namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqPollingImporterImplManagedPollingImporterImplProperties =

  //#region ComDayCqPollingImporterImplManagedPollingImporterImplProperties

  [<CLIMutable>]
  type ComDayCqPollingImporterImplManagedPollingImporterImplProperties = {
    [<JsonProperty(PropertyName = "importer.user")>]
    ImporterUser : ConfigNodePropertyString;
  }

  //#endregion
