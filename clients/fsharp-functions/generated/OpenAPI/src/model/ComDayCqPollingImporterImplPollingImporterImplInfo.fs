namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqPollingImporterImplPollingImporterImplProperties

module ComDayCqPollingImporterImplPollingImporterImplInfo =

  //#region ComDayCqPollingImporterImplPollingImporterImplInfo

  [<CLIMutable>]
  type ComDayCqPollingImporterImplPollingImporterImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqPollingImporterImplPollingImporterImplProperties;
  }

  //#endregion
