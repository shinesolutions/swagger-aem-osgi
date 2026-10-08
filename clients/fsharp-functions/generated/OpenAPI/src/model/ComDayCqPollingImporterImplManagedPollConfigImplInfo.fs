namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqPollingImporterImplManagedPollConfigImplProperties

module ComDayCqPollingImporterImplManagedPollConfigImplInfo =

  //#region ComDayCqPollingImporterImplManagedPollConfigImplInfo

  [<CLIMutable>]
  type ComDayCqPollingImporterImplManagedPollConfigImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqPollingImporterImplManagedPollConfigImplProperties;
  }

  //#endregion
