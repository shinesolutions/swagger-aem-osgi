namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties

module ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo =

  //#region ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo

  [<CLIMutable>]
  type ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties;
  }

  //#endregion
