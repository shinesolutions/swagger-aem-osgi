namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqPollingImporterImplManagedPollingImporterImplProperties

module ComDayCqPollingImporterImplManagedPollingImporterImplInfo =

  //#region ComDayCqPollingImporterImplManagedPollingImporterImplInfo

  [<CLIMutable>]
  type ComDayCqPollingImporterImplManagedPollingImporterImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqPollingImporterImplManagedPollingImporterImplProperties;
  }

  //#endregion
